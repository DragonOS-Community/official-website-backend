package com.dragonos.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 开启定时任务功能
@MapperScan("com.dragonos.website.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




}
