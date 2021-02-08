package com.Demo05_Poly_BigHwProj;

public class Bear extends Animal implements IAct{
    // 构造方法
    public Bear(String name, int age) {
        super(name, age);
    }

    // 重写抽象父类的抽象方法
    @Override
    public void love() {
        System.out.println("喜好卖萌");
    }


    // 重写接口的抽象方法
    @Override
    public void skill() {
        System.out.println("挽着花篮，打着雨伞，自立走秀");
    }

    @Override
    public void act() {
        System.out.println("表演者：" + getName());
        System.out.println("年龄：" + getAge() + "岁");
        this.skill();
        this.love();
    }
}
