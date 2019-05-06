package com.vince.service.impl;

import com.vince.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * Package: com.vince.service.impl
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/4/12
 * Time: 18:56
 * Description:
 */
@Slf4j
@Service
public class ConsumerServiceImpl implements CommandLineRunner, ConsumerService {

    @Override
    public void run(String... strings) throws Exception {
        log.info("=====ConsumerServiceImpl=====");
    }


}
