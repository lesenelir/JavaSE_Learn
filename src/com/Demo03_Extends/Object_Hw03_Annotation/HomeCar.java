package com.Demo03_Extends.Object_Hw03_Annotation;

public final class HomeCar extends Car {
    private int num;

    // 构造方法
    public HomeCar() {
    }

    public HomeCar(String color, String userName, int num) {
        super(color, userName);
        this.num = num;
    }

    // getter/setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // 方法
    public void display() {
        System.out.println(this.getUserName() + "拥有的" + this.getColor() + "颜色的私家车有" + this.getNum() + "座位");
    }

    // 重载方法
    public void display(int num) {
        System.out.println("家用汽车大多有" + num + "个座位");
    }

}
