package com.csair.b2c.cloud.test.learn.java.utils;

import lombok.SneakyThrows;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * @author yudong
 * @date 2019/11/14
 */
public class MD5Utils {

    private final static String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    @SneakyThrows
    public static String encode(String origin) {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return byteArrayToHexString(md.digest(origin.getBytes(StandardCharsets.UTF_8)));
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte value : b) {
            stringBuilder.append(byteToHexString(value));
        }
        return stringBuilder.toString();
    }

    private static String byteToHexString(byte b) {
        int n = unsignedByte(b);
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    private static int unsignedByte(byte origin) {
        return (origin < 0) ? origin + 256 : origin;
    }
}
