package com.Demo03_Extends.Object_Hw02;

public class Fruits {
    private String shape;
    private String taste;

    // 构造方法
    public Fruits() {
    }

    public Fruits(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }

    // getter/setter
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    // 普通方法
    public void eat() {
        System.out.println("水果可供人们食用！");
    }

    // 重写equals方法
    // 【重点】：此函数用于比较对象内容是否一直【可适当进行记忆，注意此函数带入参数是对象类型】
    // Object类的equals用于比较对象地址的比较
    public boolean equals(Fruits obj) {
        if (obj == null) {
            return false;
        }
        if (this.getShape().equals(obj.getShape()) && (this.getTaste() == obj.getTaste())) {
            return true;
        } else {
            return false;
        }
    }

}
