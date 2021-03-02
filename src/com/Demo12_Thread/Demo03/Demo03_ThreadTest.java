package com.Demo12_Thread.Demo03;

public class Demo03_ThreadTest {
    public static void main(String[] args) {
        // 通过实现Runnable接口来创建线程总共有三步
        // 1. 创建Runnable实现类的对象
        PrintRunnable printRunnable1 = new PrintRunnable();
        // 2. 通过Runnable实现类对象创建线程类对象
        Thread thread1 = new Thread(printRunnable1);    // 创建一个基于Runnable接口实现类的线程对象
        // 3. 调用
        thread1.start();


        PrintRunnable printRunnable2 = new PrintRunnable();
        Thread thread2 = new Thread(printRunnable2);
        thread2.start();
    }
}


class PrintRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行-" + i);
        }
    }
}

