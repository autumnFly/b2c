package com.csair.b2c.cloud.test.learn.java.test;

import org.junit.Test;

import java.net.URI;
import java.util.prefs.Preferences;

/**
 * @author yudong
 * @date 2019/5/9
 */
public class AnTest {
    @Test
    public void test() throws Exception {
        String s = "http://192.168.240.4:8066/washingservice?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";
        URI uri = new URI(s);
        uri.getHost();

    }
}
