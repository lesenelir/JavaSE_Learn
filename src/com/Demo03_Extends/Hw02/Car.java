package com.Demo03_Extends.Hw02;

public class Car {
    private String brand;
    private String color;
    private int wheelNum = 2;
    private int seatNum = 1;

    // 构造方法 无参、双参、四参构造方法
    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String color, int wheelNum, int seatNum) {
        this.brand = brand;
        this.color = color;
        this.wheelNum = wheelNum;
        this.seatNum = seatNum;
    }

    // getter/setter方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    // 编写运行方法
    public void printInfo() {
        System.out.println("这是一辆" + this.color + "，" + this.brand + "牌的非机动车，有"
                + this.wheelNum + "个轮子，有" + this.seatNum + "个座椅");
    }


}
