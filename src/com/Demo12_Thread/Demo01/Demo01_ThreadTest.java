package com.Demo12_Thread.Demo01;

public class Demo01_ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1");
        MyThread myThread = new MyThread();
        myThread.start();  // 启动线程是start方法
        System.out.println("主线程2");
    }
}


class MyThread extends Thread {
    // 继承Thread类并重写run方法  ----> 创建线程方法1
    @Override
    public void run() {
        super.run();
        System.out.println(getName() + "该线程正在执行。。。");
    }
}