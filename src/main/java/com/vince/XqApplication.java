package com.vince;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@MapperScan("com.vince.dao")
@SpringBootApplication
public class XqApplication {

    public static void main(String[] args) {
        SpringApplication.run(XqApplication.class, args);
    }

}
