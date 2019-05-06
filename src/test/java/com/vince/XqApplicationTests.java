/*
package com.vince;

import com.vince.dao.JimDb;
import org.apache.hadoop.hbase.util.MD5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XqApplicationTests {

    public BlockingQueue<String> Test_Queue = new ArrayBlockingQueue<>(100);


    @Test
    public void testQueue() throws InterruptedException, IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {//一直监听，直到受到停止的命令
            Socket socket = null;
            try {
                socket = serverSocket.accept();//如果没有请求，会一直hold在这里等待，有客户端请求的时候才会继续往下执行
                // log
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));//获取输入流(请求)
                StringBuilder stringBuilder = new StringBuilder();
                String line = null;
                while ((line = bufferedReader.readLine()) != null
                        && !line.equals("")) {//得到请求的内容，注意这里作两个判断非空和""都要，只判断null会有问题
                    stringBuilder.append(line).append("<br>");
                }
                String result = stringBuilder.toString();
                System.out.println(result);
                // echo
                PrintWriter printWriter = new PrintWriter(
                        socket.getOutputStream(), true);//这里第二个参数表示自动刷新缓存
                printWriter.println("HTTP/1.1 200 OK");
                printWriter.println("Content-Type:text/html;charset=utf-8");
                printWriter.println();

                printWriter.println("<h5>你刚才发送的请求数据是：<br>");
                printWriter.write(result);//将日志输出到浏览器
                printWriter.println("</h5>");
                // release
                printWriter.close();
                bufferedReader.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void contextLoads() throws InterruptedException {
        //连接本地的 Redis 服务
        //System.out.println(JimDb.getJimdb().get("runoobkey"));
        */
/*for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    JimDb.getJimdb().setnx("test", Thread.currentThread().getName());
                }
            }).start();
        }
        Thread.sleep(2000);*//*

        JimDb.getJimdb().setnx("test", Thread.currentThread().getName());
        System.out.println(JimDb.getJimdb().get("runoobkey"));

        */
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
        }*//*


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
        */
/*ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(() -> {
            JimDb.getJimdb().setnx("name1", "duanxiaoqiu2");
        });
        es.execute(() -> {
            JimDb.getJimdb().setnx("name1", "duanxiaoqiu0");
        });
        es.shutdown();
        System.out.println(JimDb.getJimdb().get("name1"));*//*

    }


    @Test
    public void testJimdb() {

        //System.out.println(MD5("42273616", "3100478"));
        String uid = "c2349a17797a4f16-38e60a717af4";
        String sku = "141895";

        String rowkey = toHbaseRowKey("ac" + "|" + uid + "|" + sku);
        System.out.println(rowkey);

        */
/*JimDb.getJimdb().setnx("name", "duanxiaoqiu");
        System.out.println(JimDb.getJimdb().get("name"));*//*

    }

    private String MD5(String saleOrdId, String itemId) {
        return MD5Hash.getMD5AsHex((saleOrdId + itemId).getBytes()).substring(0, 8) + "|" + saleOrdId + "|" + itemId;
    }

    public String toHbaseRowKey(String key) {
        String[] params = key.split("\\|");
        int len = 3;
        if (params.length < len) {
            return null;
        }
        return MD5Hash.getMD5AsHex(key.getBytes()).substring(0, 8) + "|" + params[1] + "|" + params[2] + "|" + params[0];
    }


}
*/
