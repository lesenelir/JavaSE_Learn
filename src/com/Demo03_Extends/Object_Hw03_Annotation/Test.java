package com.Demo03_Extends.Object_Hw03_Annotation;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("红色", "LL");
        Car car2 = new Car("红色", "LL");
        car1.use();
        System.out.println("car1和car2的引用比较:" + car1.equals(car2));
        System.out.println("=================");
        Taxi taxi = new Taxi("蓝色", "张小泉", "长生公司");
        taxi.ride();
        taxi.use();
        System.out.println(taxi.toString());
        System.out.println("=================");
        HomeCar homecar = new HomeCar("紫色", "孙二娘", 7);
        homecar.display();
        homecar.display(5);
    }
}



/*
*   注解@：源码注解、编译时注解、运行时注解
*
* */
