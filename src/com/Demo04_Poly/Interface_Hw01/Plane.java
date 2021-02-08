package com.Demo04_Poly.Interface_Hw01;

public class Plane implements IFly {

    // 重写接口方法
    @Override
    public void fly() {
        System.out.println("飞机在天上飞");
    }
}
