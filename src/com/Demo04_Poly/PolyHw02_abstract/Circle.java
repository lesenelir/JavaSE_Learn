package com.Demo04_Poly.PolyHw02_abstract;

public class Circle extends Shape {
    private double r;

    // constructor
    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    // getter/setter
    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    // 重写父类抽象类的抽象方法
    @Override
    public double area() {
        double res = Math.PI * this.getR() * this.getR();
        return res;
    }
}
