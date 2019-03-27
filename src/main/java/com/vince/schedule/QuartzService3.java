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
 * Time: 16:27
 * Description:
 */
@Slf4j
@Component
public class QuartzService3 {

    //    每分钟启动
    //@Scheduled(cron = "0/1 * * * * ?")
    //@Async//开启异步方法
    public void timerToNow() {
        try {
            log.debug("=======QuartzService3 start:{}======", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            Thread.sleep(3000);
            log.debug("=======QuartzService3 end:{}======", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
