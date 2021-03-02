package com.Demo12_Thread.Demo04_Sleep;

public class SleepTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread thread1 = new Thread(myThread);
        thread1.start();

        Thread thread2 = new Thread(myThread);
        thread2.start();
    }
}


class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次");
            try {
                Thread.sleep(1000);   // sleep是处于待机状态，是线程暂时放弃CPU的使用权【等待获取CPU的使用权】
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}