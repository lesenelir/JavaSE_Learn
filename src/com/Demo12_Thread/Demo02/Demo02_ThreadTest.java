package com.Demo12_Thread.Demo02;

public class Demo02_ThreadTest {
    public static void main(String[] args) {
        // 线程获取CPU使用权是随机的
        MyThread myThread1 = new MyThread("线程1");
        MyThread myThread2 = new MyThread("线程2");
        myThread1.start();
        myThread2.start();
    }
}

class MyThread extends Thread {
    // 构造方法
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在执行-" + i);
        }
    }
}


