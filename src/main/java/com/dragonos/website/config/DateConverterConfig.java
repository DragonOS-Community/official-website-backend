package com.dragonos.website.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: bys319.com
 */
//@Configuration
public class DateConverterConfig {
//
//    //不要听信idea的自动提示将代码转化成lambda方式，会报错
//    @Bean
//    public Converter<String, LocalDateTime> LocalDateTimeConvert() {
//         return new Converter<String, LocalDateTime>() {
//            @Override
//            public LocalDateTime convert(String source) {
//
//                DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//                LocalDateTime date = null;
//                try {
//                    date = LocalDateTime.parse(source, df);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                return date;
//            }
//        };
//    }
//
//    @Bean
//    public Converter<String, LocalDate> LocalDateConvert() {
//        return new Converter<String, LocalDate>() {
//            @Override
//            public LocalDate convert(String source) {
//
//                DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//                LocalDate date = null;
//                try {
//                    date = LocalDate.parse(source, df);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                return date;
//            }
//        };
//    }
//
//    @Bean
//    public Converter<String, LocalTime> LocalTimeConvert() {
//        return new Converter<String, LocalTime>() {
//            @Override
//            public LocalTime convert(String source) {
//
//                DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//                LocalTime date = null;
//                try {
//                    date = LocalTime.parse(source, df);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                return date;
//            }
//        };
//    }

}
