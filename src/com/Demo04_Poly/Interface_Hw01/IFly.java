package com.Demo04_Poly.Interface_Hw01;

public interface IFly {

    // 接口中抽象方法可以不写public、abstract关键字
    public abstract void fly();

    // 接口中可以定义常量，默认：public static final , 并且一定要赋值
    int TEMP = 20;
    public static final int TEMP2 = 10;

    // 默认方法体
    // default默认方法体，可以在类中重写，并且可以通过接口的引用调用
    default void printDefault() {
        System.out.println("接口的默认Default方法体");
    }

    // 静态方法体
    // static方法体，不可以在类中重写，可以通过接口的引用调用
    static void printStatic() {
        System.out.println("接口的默认Default方法体");
    }
}
