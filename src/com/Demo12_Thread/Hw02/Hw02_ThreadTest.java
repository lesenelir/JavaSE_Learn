package com.Demo12_Thread.Hw02;

public class Hw02_ThreadTest {
    public static void main(String[] args) {
        // 创建两个实现类对象
        Cat cat = new Cat();
        Dog dog = new Dog();

        // 通过实现类对象创建线程对象
        Thread threadCat = new Thread(cat);
        Thread threadDog = new Thread(dog);

        // 调用
        threadCat.start();
        threadDog.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("main thread");
        }
    }
}


class Cat implements Runnable {
    // 重写方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A cat");
        }
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A dog");
        }
    }
}