package com.vince;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.vince.dao")
public class XqApplication {

    public static void main(String[] args) {
        SpringApplication.run(XqApplication.class, args);
    }

}
