package com.Demo12_Thread.Demo05_join;

public class JoinDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);

        thread.start();

        // join方法是抢占CPU的处理
        try {
            thread.join();     // thread线程调用join方法进行强占CPU资源
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程正在执行" + i);
        }
        System.out.println("主线程执行完毕");
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行" + i);
        }    
    }
}
