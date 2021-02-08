package com.Demo04_Poly.PolyHw02_abstract;

public class Rectangle extends Shape {
    private int length;
    private int weight;

    public Rectangle() {
    }

    public Rectangle(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    // getter/setter


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double area() {
        double res = this.getLength() * this.getWeight();
        return res;
    }
}
