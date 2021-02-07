package com.Demo03_Extends.Object;

public class Test_toString {
    public static void main(String[] args) {
        Animal_toString obj = new Animal_toString();

        // 输出对象名时，默认会直接调用类的toString方法
        // 继承Object类的toString方法，输出：类型信息+@+地址信息
        System.out.println(obj);
        System.out.println(obj.toString());

        System.out.println("===========");

        // 重写类的toString方法


    }
}


class Animal_toString {
    private String name;
    private int age;

    // 构造方法
    public Animal_toString() {
    }

    public Animal_toString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter/setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写toString方法
    /*
    public String toString() {
        return this.getName() + this.getAge();
    }
    */

}