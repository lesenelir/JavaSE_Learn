package com.Demo03_Extends.Object_Hw02;

public class Banana extends Fruits {
    private String variety;

    // 构造方法
    public Banana() {
    }

    public Banana(String shape, String taste, String variety) {
        super(shape, taste);
        this.variety = variety;
    }

    // getter/setter
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    // 创建方法
    public void advantage() {
        System.out.println(this.getVariety() + "果形" + this.getShape() + "，果肉香甜，可供生食");
    }

    // 重载advantage
    public void advantage(String color) {
        System.out.println(this.getVariety() + "颜色为" + color);
    }




}
