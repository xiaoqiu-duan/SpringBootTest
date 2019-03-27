package com.vince;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


//@ImportResource("classpath:spring-config-*.xml")
@PropertySource(value = {"classpath:conf.properties"},encoding="utf-8")
/*@EnableAsync
@EnableScheduling*/
@MapperScan("com.vince.dao")
@SpringBootApplication
public class XqApplication {

    public static void main(String[] args) {
        SpringApplication.run(XqApplication.class, args);
    }

}
