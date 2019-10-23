package com.csair.b2c.cloud.test.sys.cbd;

import com.alibaba.fastjson.JSONObject;

/**
 * 当前包的其他文件均是根据wsdl文件自动生成的
 * <p>
 * Created on 2018/8/27.<br/>
 *
 * @author yudong
 */
public class AnEntranceTest {
    public static void main(String[] args) throws Exception {
        NEWCBDCCSWebService service = new NEWCBDCCSWebService();
        NEWCBDCCSWebServicePortType portType = service.getNEWCBDCCSWebServiceHttpPort();
        String res = portType.hasEnabledPassword("180007020302");
        System.out.println(res);
        MemberExchangeInfoForB2CDto b2CDto = portType.queryMemberInfoForB2C("180007020302");
        System.out.println(JSONObject.toJSONString(b2CDto, true));

    }
}
