package com.Demo03_Extends.Hw02;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("天宇", "红颜色", 4, 2);
        car.printInfo();

        Bicycle bicycle = new Bicycle("捷安特","黄颜色");
        bicycle.printInfo();

        PowerCar powercar = new PowerCar("飞鸽牌");
        powercar.printInfo();

        ThreeWheel threeWheel = new ThreeWheel();
        threeWheel.printInfo();

    }
}
