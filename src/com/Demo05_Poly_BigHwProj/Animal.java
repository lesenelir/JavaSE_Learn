package com.Demo05_Poly_BigHwProj;

public abstract class Animal {
    private String name;
    private int age;

    // 构造方法
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter/setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 描述喜好抽象方法
    public abstract void love();


}
