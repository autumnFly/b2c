package com.csair.b2c.cloud.test.jms.listener;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.jms.constant.JmsConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yudong
 */
@Component
public class JmsServiceListener {
    Logger logger = LoggerFactory.getLogger(getClass());

    @JmsListener(destination = JmsConst.ACTIVE_MQ_QUEUE)
    public void recieveQueue(Map<String, String> map) {
        logger.info("Received mq queue message success:{}", JSONObject.toJSONString(map));
    }

    @JmsListener(destination = JmsConst.ACTIVE_MQ_TOPIC)
    public void recieveTopic(Map<String, String> map) {
        logger.info("Received mq topic message success:{}", JSONObject.toJSONString(map));
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(Character.isLowerCase('a'));
        for (int i = 1000; i < 10000; i++) {
            int n = 0;
            int[] rams = new int[12];
            char[] chars = ("" + i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                rams[n++] = Integer.parseInt("" + chars[j] + chars[(j + 1) % 4]);
                rams[n++] = Integer.parseInt("" + chars[(j + 1) % 4] + chars[j]);
                if (j < 2) {
                    rams[n++] = Integer.parseInt("" + chars[j] + chars[(j + 2)]);
                    rams[n++] = Integer.parseInt("" + chars[(j + 2)] + chars[j]);
                }
            }
            out:
            for (int k = 0; k < rams.length - 1; k++) {
                for (int q = k + 1; q < rams.length; q++) {

                    int tem = rams[k] * rams[q];
                    if (tem == i) {
                        char[] maybe = ("" + rams[k] + rams[q]).toCharArray();
                        List<Character> list1 = new ArrayList<>();
                        for (char h : chars) {
                            list1.add(h);
                        }
                        List<Character> list2 = new ArrayList<>();
                        for (char h : maybe) {
                            list2.add(h);
                        }
                        list1.removeAll(list2);
                        if (list1.size() != 0) {
                            continue;
                        }
                        System.out.println(i + "=" + rams[k] + "*" + rams[q]);
                        break out;
                    }

                }
            }
        }
    }
}
