package com.Demo12_Thread.Hw01;

public class Hw01_ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("打印机");
        myThread.start();
    }
}



class MyThread extends Thread {
    // constructor
    public MyThread(String name) {
        super(name);
    }

    // 重写继承Thread的run方法
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "正在打印" + i);
        }
    }
}