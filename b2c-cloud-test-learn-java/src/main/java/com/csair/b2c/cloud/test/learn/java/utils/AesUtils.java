package com.csair.b2c.cloud.test.learn.java.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.buf.HexUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
public class AesUtils {

    private static int passwordLength = 16;
    private static String al = "AES/CBC/PKCS5Padding";

    /**
     * @param password 密码
     * @param plainMsg 待加密的信息
     * @return
     */
    public static String encrypt(String password, String plainMsg) {
        try {
            if (password.length() <= passwordLength) {
                int size = passwordLength - password.length();
                password = password + StringUtils.repeat(" ", size);
            } else {
                password = password.substring(0, passwordLength);
            }
            byte[] raw = password.getBytes("UTF-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance(al);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(new byte[passwordLength]));
            byte[] bytes = cipher.doFinal(plainMsg.getBytes("UTF-8"));
            return HexUtils.toHexString(bytes).toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static String decrypt(String password, String encodedHexMsg) {
        try {
            byte[] encrypted = HexUtils.fromHexString(encodedHexMsg);
            if (password.length() <= passwordLength) {
                int size = passwordLength - password.length();
                password = password + StringUtils.repeat(" ", size);
            } else {
                password = password.substring(0, passwordLength);
            }
            byte[] raw = password.getBytes("UTF-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");

            Cipher cipher = Cipher.getInstance(al);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(new byte[passwordLength]));
            byte[] original = cipher.doFinal(encrypted);

            return new String(original, "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
