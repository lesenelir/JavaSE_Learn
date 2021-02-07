package com.Demo03_Extends.Object_Hw02;

public class Test {
    public static void main(String[] args) {
        Fruits one = new Fruits("圆形", "好吃");
        Fruits two = new Fruits("圆形", "好吃");
        one.eat();
        System.out.println("fru1和fru2的引用比较：" + one.equals(two));

        System.out.println("=======================");

        Waxberry waxberry = new Waxberry("圆形", "酸甜适中", "紫红色");
        waxberry.face();
        waxberry.eat();
        System.out.println(waxberry.toString());

        System.out.println("=======================");
        Banana banana = new Banana("短", "香甜", "圆");

        banana.advantage();
        banana.advantage("黄色");

    }
}
