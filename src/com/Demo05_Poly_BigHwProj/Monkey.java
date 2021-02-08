package com.Demo05_Poly_BigHwProj;

public class Monkey extends Animal implements IAct{
    private String type;

    // 构造方法
    public Monkey() {
    }

    public Monkey(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    // getter/setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 重写抽象类的抽象方法
    @Override
    public void love() {
        System.out.println("喜好模仿人的动作表情");
    }

    // 重写接口的抽象方法
    @Override
    public void skill() {
        System.out.println("骑独轮车过独木桥");
    }

    @Override
    public void act() {
        System.out.println("表演者：" + getName());
        System.out.println("年龄：" + getAge() + "岁");
        System.out.println("品种：" + getType());
        this.skill();
        this.love();
    }
}
