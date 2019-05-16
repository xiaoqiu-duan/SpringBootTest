package com.vince.init;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Package: com.vince.init
 * User: xiaoqiu
 * Email: xiaoqiu2017wy@163.com
 * Date: 2019/5/16
 * Time: 9:53
 * Description:
 */

@Component
@Slf4j
public class Consumer {

    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
        log.info("topic:{}, offset:{}, value:{}", record.topic(), record.offset(), record.value());
    }

    @KafkaListener(topics = {"test"})
    public void listen1(ConsumerRecord<?, ?> record) {
        log.info("1:topic:{}, offset:{}, value:{}", record.topic(), record.offset(), record.value());
    }
}
