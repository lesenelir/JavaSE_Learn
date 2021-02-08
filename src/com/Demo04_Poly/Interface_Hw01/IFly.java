package com.Demo04_Poly.Interface_Hw01;

public interface IFly {

    // 接口中抽象方法可以不写public、abstract关键字
    public abstract void fly();

    // 接口中可以定义常量，默认：public static final , 并且一定要赋值
    int TEMP = 20;
    public static final int TEMP2 = 10;
}
