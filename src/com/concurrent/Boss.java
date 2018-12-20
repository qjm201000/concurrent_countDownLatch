package com.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * 老板
 */
public class Boss implements Runnable{
    private CountDownLatch countDownLatch;
    public Boss(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("老板等待所有工人干活完成。。");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("所有工人干活完成，开始检查。。");
    }
}
