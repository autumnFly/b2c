package com.csair.b2c.cloud.test.user.service.impl;

import com.csair.b2c.cloud.test.common.model.Authorities;
import com.csair.b2c.cloud.test.common.model.GroupAuthoritiesInfo;
import com.csair.b2c.cloud.test.common.model.UserDetailBean;
import com.csair.b2c.cloud.test.common.model.Users;
import com.csair.b2c.cloud.test.user.mapper.AuthoritiesMapper;
import com.csair.b2c.cloud.test.user.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2018/12/9.<br/>
 *
 * @author yudong
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private AuthoritiesMapper authoritiesMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users dbUsers = usersMapper.selectOne(Users.getInstance().username(username));
        if (dbUsers == null) {
            throw new UsernameNotFoundException("username:" + username + " not exists");
        }
        List<Authorities> authorities = authoritiesMapper.select(Authorities.getInstance().username(username));
        GroupAuthoritiesInfo groupInfo = authoritiesMapper.selectGroupInfo(username);
        return new UserDetailBean(dbUsers, authorities, groupInfo);
    }
}
