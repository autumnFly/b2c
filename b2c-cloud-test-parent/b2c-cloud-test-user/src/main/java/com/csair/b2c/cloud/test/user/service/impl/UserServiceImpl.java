package com.csair.b2c.cloud.test.user.service.impl;

import com.csair.b2c.cloud.test.common.model.Page;
import com.csair.b2c.cloud.test.common.model.UserDetailBean;
import com.csair.b2c.cloud.test.common.model.Users;
import com.csair.b2c.cloud.test.user.mapper.UsersMapper;
import com.csair.b2c.cloud.test.user.service.UserService;
import com.csair.b2c.cloud.test.user.vo.UpdatePasswordReqVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedNotification;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.management.Notification;
import java.util.List;
import java.util.UUID;

/**
 * Created on 2018/12/9.<br/>
 *
 * @author yudong
 */
@Service
@ManagedResource(objectName = "user:name=UserServiceImpl")
@ManagedNotification(notificationTypes = "user.login", name = "tryLogin")
public class UserServiceImpl implements UserService, NotificationPublisherAware, DisposableBean {
    static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private static String keyPrefix = "spring:user:sessions:";

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    private int pageSize = 3;

    @ManagedAttribute
    public int getPageSize() {
        return pageSize;
    }

    @ManagedAttribute
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private NotificationPublisher notificationPublisher;

    @Override
    public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
        this.notificationPublisher = notificationPublisher;
    }

    @Override
    @ManagedOperation
    public Pair<String, UserDetailBean> login(Users users) {
        final Authentication authentication = authenticationManager.authenticate(
                new TestingAuthenticationToken(userDetailsService.loadUserByUsername(users.getUsername()), users.getPassword()));
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(authentication);
        UserDetailBean userDetailBean = (UserDetailBean) authentication.getPrincipal();

        // 发送jmx通知
        notificationPublisher.sendNotification(new Notification("loginUser", userDetailBean, 0));

        return new Pair<>(keyPrefix + UUID.randomUUID().toString(), userDetailBean);
    }

    @Override
    public Users findUsersByUsername(String username) {
        Users users = Users.getInstance().username(username);
        return usersMapper.selectOne(users);
    }

    @Override
    public PageInfo<Users> findUsers(Users users) {
        Page page = users.getPage();
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<Users> list = usersMapper.select(users);
        PageInfo<Users> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Users createUsers(Users users) {
        users.setEnabled(true);
        users.setFirstLogin(true);
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        usersMapper.insert(users);
        return usersMapper.selectOne(users);
    }

    @Override
    public Integer disabledUsers(Users users) {
        users.setEnabled(false);
        int affectRows = usersMapper.updateByPrimaryKeySelective(users);
        Assert.isTrue(affectRows != 0, "10002:关闭失败,用户不存在");
        return affectRows;
    }

    @Override
    public Integer enabledUsers(Users users) {
        users.setEnabled(true);
        int affectRows = usersMapper.updateByPrimaryKeySelective(users);
        Assert.isTrue(affectRows != 0, "10002:启用失败,用户不存在");
        return affectRows;
    }

    @Override
    public Integer updatePassword(UpdatePasswordReqVo reqVo) {

        Users dbUsers = findUsersByUsername(reqVo.getUsername());
        Assert.notNull(dbUsers, "10004:更新失败,用户不存在");
        Assert.isTrue(passwordEncoder.matches(reqVo.getPassword(), dbUsers.getPassword())
                , "10001:旧密码不正确");
        dbUsers.setPassword(passwordEncoder.encode(reqVo.getNewPassword()));
        int affectRows = usersMapper.updateByPrimaryKey(dbUsers);
        return affectRows;
    }

    @Override
    public void destroy() {
        logger.info("clear resource");
        Long sum = 0L;
        int max = Integer.MAX_VALUE / 3;
        for (int i = 0; i < max; i++) {
            sum += i;
        }
        logger.info("clear resource1:" + sum);
    }

}
