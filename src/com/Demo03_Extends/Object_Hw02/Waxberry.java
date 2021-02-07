package com.Demo03_Extends.Object_Hw02;

public final class Waxberry extends Fruits {
    private String color;

    // 构造方法
    public Waxberry() {
    }

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        this.color = color;
    }

    // getter/setter方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //
    public final void face() {
        System.out.println("杨梅：" + this.getColor() + this.getShape() + "，果味酸甜适中");
    }

    // 重写方法
    public void eat() {
        System.out.println("杨梅酸甜适中，非常好吃！");
    }

    public String toString() {
        String str = "杨梅的信息：果实为" + this.getShape() + "、" + this.getColor() + "," + this.getTaste() + ",非常好吃！";
        return str;
    }

}
