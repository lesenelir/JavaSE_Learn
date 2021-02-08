package com.Demo04_Poly.PolyProj01;

public class Animal {
    private String name;
    private int month;

    // 构造方法
    public Animal() {
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    // getter/setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // eat方法
    public void eat() {
        System.out.println("动物都有吃东西的能力");
    }

    // 关于static关键字
    public static void say() {
        System.out.println("动物打招呼");
    }
}
