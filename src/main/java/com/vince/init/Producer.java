package com.vince.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Package: com.vince.init
 * User: xiaoqiu
 * Email: xiaoqiu2017wy@163.com
 * Date: 2019/5/16
 * Time: 9:51
 * Description:
 */
@Order(value = 1)
@Component
@Slf4j
public class Producer implements CommandLineRunner {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void run(String... strings) throws Exception {
        while (true) {
            log.info("kafka的消息");
            kafkaTemplate.send("test", "xiaoqiu");
            kafkaTemplate.send("test1", "xiaoqiu1");
            log.info("发送kafka成功.");
            Thread.sleep(5000);
        }

    }
}
