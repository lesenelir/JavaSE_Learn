package com.Demo04_Poly.Interface_Hw01;

public class Balloon implements IFly{
    // 重写接口方法
    @Override
    public void fly() {
        System.out.println("气球飞上天空");
    }

    // 新定义属于Balloon方法
    public void printInfo() {
        System.out.println("Balloon新自定义的方法");
    }
}
