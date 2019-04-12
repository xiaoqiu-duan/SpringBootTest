package com.vince;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Package: com.vince
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/4/10
 * Time: 20:26
 * Description:
 */
public class BlockQueueDemo {


    /**
     * 生产者
     */
    static class Productor implements Runnable{

        private BlockingQueue<Integer> blockingQueue;

        Productor(BlockingQueue blockingQueue){
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            for(int i=0;i<100;i++){
                try {
                    blockingQueue.put(i);
                    System.out.println("生产者产品了产品"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 消费者
     */
    static class Consumer implements Runnable{

        public BlockingQueue<Integer> blockingQueue;

        Consumer(BlockingQueue blockingQueue){
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            while(true){
                try {
                    String name = Thread.currentThread().getName();
                    Thread.sleep(2000);
                    Integer queueData = blockingQueue.take();
                    System.out.println("消费者"+name+"消费了产品"+queueData);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 一个生产者对应多个消费者，采用BlockQueue作为缓冲区
     * @param args
     */
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);
        Productor productor = new Productor(blockingQueue);
        Productor productor2 = new Productor(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Consumer consumer2 = new Consumer(blockingQueue);
        new Thread(productor).start();
        //new Thread(productor2).start();
        new Thread(consumer2).start();
    }
}