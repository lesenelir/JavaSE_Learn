package com.Demo04_Poly.PolyProj01;

public class Cat extends Animal {
    private double weight;

    // 构造方法
    public Cat() {
    }

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.weight = weight;
    }

    // getter/setter方法
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // run方法
    public void run() {
        System.out.println("小猫快乐的奔跑");
    }

    // 重写父类方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 父类static关键字修饰的方法，子类也用static修饰相同的方法名：=====> 则此时是不同的方法
    public static void say() {
        System.out.println("猫叫");
    }
}
