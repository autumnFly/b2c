package com.csair.b2c.cloud.test.learn.java.test;

import com.csair.b2c.cloud.test.learn.java.utils.AesUtils;
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
}
