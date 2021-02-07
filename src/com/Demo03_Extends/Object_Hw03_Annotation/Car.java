package com.Demo03_Extends.Object_Hw03_Annotation;

import java.util.Objects;

public class Car {
    private String color;
    private String userName;

    // 构造方法
    public Car() {
    }

    public Car(String color, String userName) {
        this.color = color;
        this.userName = userName;
    }

    // getter/setter方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // 方法
    public void use() {
        System.out.println("我是机动车！");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) &&
                Objects.equals(userName, car.userName);
//        if (car == null) { // 手写匹配代码
//            return false;
//        }
//        if (this.getColor().equals(car.getColor()) && (this.getUserName().equals(car.getUserName()))) {
//            return true;
//        } else {
//            return false;
//        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, userName);
    }
}
