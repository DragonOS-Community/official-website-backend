package com.dragonos.website.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM");


    /**
     *
     * @param str 20211003124534
     * @return
     */
    public static LocalDateTime parStrToLocalDateTime(String str) {

        String year = str.substring(0, 4);
        String month = str.substring(4, 6);
        String day = str.substring(6, 8);
        String hour = str.substring(8, 10);
        String minutes = str.substring(10, 12);
        String seconds = str.substring(12, 14);
        LocalDateTime localDateTime = LocalDateTime.now().withYear(Integer.parseInt(year))
                .withMonth(Integer.parseInt(month))
                .withDayOfMonth(Integer.parseInt(day))
                .withHour(Integer.parseInt(hour))
                .withMinute(Integer.parseInt(minutes))
                .withSecond(Integer.parseInt(seconds));
        return localDateTime;

    }


    /**
     * 将localDateTime 转换成 yyyy-MM-dd HH:mm:ss 字符串
     * @param localDateTime
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String localDate2Str(LocalDateTime localDateTime){
        String time = localDateTime.format(formatter);
        return time;
    }

    /**
     * 将localDateTime 转换成 yyyy-MM 字符串
     * @param localDateTime
     * @return yyyy-MM
     */
    public static String localDate2Str1(LocalDateTime localDateTime){
        String time = localDateTime.format(formatter2);
        return time;
    }

    /**
     * 将localDateTime 转换成 yyyy-MM-dd 字符串
     * @param localDateTime
     * @return yyyy-MM-dd
     */
    public static String localDate2Str2(LocalDateTime localDateTime){
        String time = localDateTime.format(formatter1);
        return time;
    }



}
