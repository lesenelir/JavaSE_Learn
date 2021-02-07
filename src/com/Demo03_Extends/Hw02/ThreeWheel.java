package com.Demo03_Extends.Hw02;

public class ThreeWheel extends Car {
    public ThreeWheel() {
        this.setWheelNum(3);
    }

    // 重写运行方法
    public void printInfo() {
        System.out.println("三轮车是一款有" + this.getWheelNum() + "个轮子的非机动车");
    }

}
