package com.Demo02_Class;

public class Demo03_Hw_MonkeyClassTest {
    public static void main(String[] args) {
        System.out.println("我是无参的构造方法");
        Monkey one = new Monkey();

        System.out.println("====================");

        System.out.println("我是有参的构造方法");
        Monkey two = new Monkey("白头叶猴", "头上有白毛，喜欢吃树叶");
    }
}


class Monkey {
    private String name;
    private String feature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Monkey() {
        System.out.println("名称：长尾猴");
        System.out.println("特征：尾巴长");
    }

    public Monkey(String name, String feature) {

        // 构造方法中要设置属性变量通常用set方法来设置，不要使用直接的修改属性变量
        this.setName(name);
        this.setFeature(feature);

//        this.name = name;
//        this.feature = feature;

        System.out.println(this.name);
        System.out.println(this.feature);
    }
}