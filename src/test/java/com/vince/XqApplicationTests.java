package com.vince;

import com.vince.dao.JimDb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XqApplicationTests {

    public BlockingQueue<String> Test_Queue = new ArrayBlockingQueue<>(100);


    @Test
    public void testQueue() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Test_Queue.put(String.valueOf(i));
        }
        while (true) {
            System.out.println(Test_Queue.size());
            System.out.println(Test_Queue.take());
        }
    }

    @Test
    public void contextLoads() throws InterruptedException {
        //连接本地的 Redis 服务
        //System.out.println(JimDb.getJimdb().get("runoobkey"));
        /*for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    JimDb.getJimdb().setnx("test", Thread.currentThread().getName());
                }
            }).start();
        }
        Thread.sleep(2000);*/
        JimDb.getJimdb().setnx("test", Thread.currentThread().getName());
        System.out.println(JimDb.getJimdb().get("runoobkey"));

        /*for (int i = 0; i < 100; i++) {
            JimDb.getJimdb().rpush("test", i + "123");

        }
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                        for (int i = 0; i < 100; i++) {
                            System.out.println(Thread.currentThread().getName() + "-" + JimDb.getJimdb().lpop("test"));
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }*/

        // 获取存储的数据并输出
        //System.out.println("redis 存储的字符串为: "+ JimDb.getJimdb().lpop("runoobkey"));
    }


    @Test
    public void testThread() throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {

                }
                System.out.println(1);
            }
        }).start();


        try {
            cyclicBarrier.await();
        } catch (Exception e) {

        }
        System.out.println(3);

    }


    @Test
    public void testPool() {
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(() -> {
            JimDb.getJimdb().setnx("name1","duanxiaoqiu2");
        });
        es.execute(()->{
            JimDb.getJimdb().setnx("name1","duanxiaoqiu0");
        });
        es.shutdown();
        System.out.println(JimDb.getJimdb().get("name1"));
    }


    @Test
    public void testJimdb() {
        JimDb.getJimdb().setnx("name","duanxiaoqiu");
        System.out.println(JimDb.getJimdb().get("name"));
    }

}
