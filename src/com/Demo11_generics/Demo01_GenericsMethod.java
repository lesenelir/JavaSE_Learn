package com.Demo11_generics;

public class Demo01_GenericsMethod {
    public <T extends Number> void printValue(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Demo01_GenericsMethod gm = new Demo01_GenericsMethod();
//        gm.printValue("hello");
        gm.printValue(123);
        gm.printValue(5.10f);
    }
}
