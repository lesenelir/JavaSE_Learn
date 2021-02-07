package com.Demo03_Extends.Hw02;

public class Bicycle extends Car {
    // 调用父类的带参构造方法
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    // 重写父类运行方法
    public void printInfo() {
        System.out.println("这是一辆" + this.getColor() + "，" + this.getBrand() + "牌的自行车");
    }
}
