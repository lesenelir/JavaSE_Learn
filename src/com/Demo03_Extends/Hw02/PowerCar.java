package com.Demo03_Extends.Hw02;

public class PowerCar extends Car {
    private String powerBrand;

    // 构造方法
    public PowerCar() {
    }

    public PowerCar(String powerBrand) {
        this.powerBrand = powerBrand;
    }

    // getter/setter
    public String getPowerBrand() {
        return powerBrand;
    }

    public void setPowerBrand(String powerBrand) {
        this.powerBrand = powerBrand;
    }

    // 重写运行方法
    public void printInfo() {
        System.out.println("这是一辆使用"+this.powerBrand +"电池的电动车");
    }
}
