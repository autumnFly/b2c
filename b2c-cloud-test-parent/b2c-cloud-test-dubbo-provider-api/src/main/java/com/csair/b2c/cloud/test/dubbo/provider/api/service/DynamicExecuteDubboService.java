package com.csair.b2c.cloud.test.dubbo.provider.api.service;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
public interface DynamicExecuteDubboService {

    Object compilerAndExecute(String code);

    Object execute(byte[] classByteCode);

}
