package com.Demo04_Poly.PolyHw02_abstract;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(15, 2);

        System.out.printf("圆形的面积：%.3f\n", circle.area());
        System.out.println("长方形的面积：" + rectangle.area());
    }
}
