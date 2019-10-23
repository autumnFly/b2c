package com.csair.b2c.cloud.test.sys;

import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;

/**
 * Created on 2018/8/26.<br/>
 *
 * @author yudong
 */
public class JaxWsTest extends CommonTestCode {


    @Test
    public void testJaxWs() throws Exception {
        Service service = new Service();
        Call call = service.createCall();
        call.setTargetEndpointAddress("http://localhost:8080/rpc/services/bookService");
        call.setOperationName(new QName("http://webservice.rpc.test.cloud.b2c.csair.com/",
                "getBookWithString"));
        call.addParameter("id", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        Object result = call.invoke(new Object[]{"10001"});
        System.out.println(result);
    }
    @Test
    public void testJaxWs2() throws Exception {
        Service service = new Service();
        Call call = service.createCall();
        call.setTargetEndpointAddress("http://10.79.0.101:8180/CBDCCSWebService/services/NEWCBDCCSWebService");
        call.setOperationName(new QName("http://web.service.newccs.cbd.csair.com",
                "hasEnabledPassword"));
        call.addParameter("in0", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        Object result = call.invoke(new Object[]{"180007020302"});
        System.out.println(result);
    }
}
