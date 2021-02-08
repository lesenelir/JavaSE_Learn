package com.Demo05_Poly_BigHwProj;

public class Clown extends Animal implements IAct{
    private String name;
    private int years;

    // 构造方法
    public Clown() {
    }

    public Clown(String name, int years) {
        this.name = name;
        this.years = years;
    }

    // getter/setter方法
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    // 新增方法
    public void dress() {
        System.out.println("着装：身穿五彩服装，头上戴这彩色的帽子，脸上画着夸张的彩状");
    }

    // 重写抽象类的抽象方法
    @Override
    public void love() {

    }

    // 重写接口的抽象方法
    @Override
    public void skill() {
        System.out.println("技能：脚踩高翘，进行杂技魔术表演");
    }

    @Override
    public void act() {
        System.out.println("表演者：" + getName());
        System.out.println("年龄：" + getAge() + "岁");
        this.dress();
        this.skill();
    }
}
