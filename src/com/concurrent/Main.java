package com.concurrent;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);//五个工人

        //工人
        Worker worker1 = new Worker(countDownLatch);
        new Thread(worker1).start();
        Worker worker2 = new Worker(countDownLatch);
        new Thread(worker2).start();
        Worker worker3 = new Worker(countDownLatch);
        new Thread(worker3).start();
        Worker worker4= new Worker(countDownLatch);
        new Thread(worker4).start();
        Worker worker5 = new Worker(countDownLatch);
        new Thread(worker5).start();

        //老板
        Boss boss = new Boss(countDownLatch);
        new Thread(boss).start();
    }
}
