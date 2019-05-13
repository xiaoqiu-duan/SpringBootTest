package com.vince.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Package: com.vince.schedule
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/3/22
 * Time: 11:48
 * Description:
 */
@Slf4j
@Component
public class QuartzService {

    //    每60s启动
    @Async
    @Scheduled(cron = "0/60 * * * * ?")
    public void timerToNow() {
        log.debug("=======QuartzService1 time:{}======", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
