package com.dragonos.website.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {

    public static void main(String[] args) throws Exception {
        String str = "2021-12-01 19:34:56";
        enAndDeCode(str);

        Integer i = 12;
        enAndDeCode(i);


    }


    public static byte[] intToByteArray(int value) {
        byte[] byteArray = new byte[4];
        byteArray[0] = (byte) (value & 0xFF);
        byteArray[1] = (byte) (value & 0xFF00);
        byteArray[2] = (byte) (value & 0xFF0000);
        byteArray[3] = (byte) (value & 0xFF000000);
        return byteArray;
    }

    /**
     * BASE64加密解密
     */
    public static void enAndDeCode(String str) throws Exception {
        String data = encryptBASE64(str.getBytes());
        System.out.println("sun.misc.BASE64 加密后：" + data);

        byte[] byteArray = decryptBASE64(data);
        System.out.println("sun.misc.BASE64 解密后：" + new String(byteArray));
    }

    /**
     * BASE64加密解密
     */
    public static void enAndDeCode(Integer value) throws Exception {
        byte[] bytes = intToByteArray(value);
        String data = encryptBASE64(bytes);
        System.out.println("sun.misc.BASE64 加密后：" + data);

        byte[] byteArray = decryptBASE64(data);
        System.out.println("sun.misc.BASE64 解密后：" + new String(byteArray));
    }

    /**
     * BASE64解密
     *
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }
}
