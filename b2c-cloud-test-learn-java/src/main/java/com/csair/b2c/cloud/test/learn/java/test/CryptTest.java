package com.csair.b2c.cloud.test.learn.java.test;

import com.csair.b2c.cloud.test.learn.java.utils.AesUtils;
import com.csair.b2c.cloud.test.learn.java.utils.MD5Utils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
public class CryptTest {
    @BeforeClass
    public static void init() {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Test
    public void test() {
        System.out.println(AesUtils.encrypt("qq123123", "hello world"));
        System.out.println(AesUtils.decrypt("qq123123", AesUtils.encrypt("qq123123", "hello world")));
    }

    @Test
    public void test1() throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] keyBytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String algorithm = "RawBytes";
        SecretKeySpec key = new SecretKeySpec(keyBytes, algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] plainText = "abcdefghijklmnopqrstuvwxyz".getBytes("UTF-8");
        byte[] cipherText = cipher.doFinal(plainText);
        System.out.println(cipherText);
    }

    @Test
    public void test2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Er78s1hcT4Tyoaj2")
                .append("wx")
                .append("123")
                .append("json")
                .append("1573535094332")
                .append("2.5.0")
                .append("{\"addressInfo\":{\"addressId\":\"A1909110924542200001\",\"address\":\"新华街道顶顶顶顶23号\",\"receiver\":\"狂铁\",\"receiverMobile\":\"18826483971\",\"provinceId\":\"21\",\"provinceName\":\"辽宁\",\"cityId\":\"2101\",\"cityName\":\"沈阳\",\"countyId\":\"210102\",\"countyName\":\"和平区\",\"streetId\":\"\",\"streetName\":\"\",\"villageId\":\"\",\"villageName\":\"\",\"isDefault\":true},\"collectType\":\"express\",\"remark\":\"电饭锅和健康了\",\"token\":\"80499c515049a18533045d4fdc26d3ed\",\"appointTime\":1573660800000,\"appointSlot\":\"17:00~19:00\"}")
                .append("Er78s1hcT4Tyoaj2");
        String s = MD5Utils.encode(stringBuilder.toString());
        System.out.println(s);
    }
}
