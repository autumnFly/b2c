package com.csair.b2c.cloud.test.dubbo.provider.dubbo.impl;

import com.csair.b2c.cloud.test.dubbo.provider.api.service.DynamicExecuteDubboService;
import com.csair.b2c.cloud.test.dubbo.provider.dubbo.helper.UserHelper;
import com.csair.b2c.cloud.test.learn.java.utils.DynamicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
@Service
public class DynamicExecuteDubboServiceImpl implements DynamicExecuteDubboService {

    @Autowired
    private UserHelper userHelper;

    @Override
    public Object compilerAndExecute(String code) {
        return DynamicUtils.compileAndExecuteSourceCode(code);
    }

    @Override
    public Object execute(byte[] classByteCode) {
        return DynamicUtils.executeByteCode(classByteCode);
    }

}
