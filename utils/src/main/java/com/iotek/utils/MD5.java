package com.iotek.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: 邪灵
 * @Date: 2019/12/24 16:13
 * @Description: MD5加密代码
 * @Since: 1.0
 */
public class MD5 {
    public static String md(String string) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("md5");
        byte[] digest = md5.digest(string.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte bt : digest) {
            int num = bt & 0xff;
            String str = Integer.toHexString(num);
            if (str.length()==1){
                sb.append('0');
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
