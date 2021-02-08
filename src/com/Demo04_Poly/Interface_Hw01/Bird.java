package com.Demo04_Poly.Interface_Hw01;

public class Bird implements IFly {
    // 重写接口方法
    @Override
    public void fly() {
        System.out.println("小鸟在天空翱翔");
    }
}
