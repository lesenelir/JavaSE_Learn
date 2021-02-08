package com.Demo05_Poly_BigHwProj;

public class Lion extends Animal implements IAct {
    private String color;
    private String sex;

    // 构造方法
    public Lion() {
    }

    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.color = color;
        this.sex = sex;
    }

    // getter/setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 实现抽象类的抽象方法
    @Override
    public void love() {
        System.out.println("喜好吃各种肉类");
    }

    // 实现接口的抽象方法
    @Override
    public void skill() {
        System.out.println("技能：擅长钻火圈");
    }

    @Override
    public void act() {
        System.out.println("表演者：" + getName());
        System.out.println("年龄：" + getAge() + "岁");
        System.out.println("毛色：" + getColor());
        System.out.println("性别：" + getSex());
        this.skill();
        this.love();
    }
}
