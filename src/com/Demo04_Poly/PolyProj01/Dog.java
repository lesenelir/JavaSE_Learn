package com.Demo04_Poly.PolyProj01;

public class Dog extends Animal {
    private String sex;

    // constructor function
    public Dog() {
    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.sex = sex;
    }

    // getter/setter
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // sleep
    public void sleep() {
        System.out.println("狗爱睡觉");
    }

    // 重写父类方法


    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
