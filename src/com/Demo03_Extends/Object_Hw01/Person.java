package com.Demo03_Extends.Object_Hw01;

public class Person {
    private String name;
    private int age;
    private String sex;

    // 构造方法
    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            this.sex = "男";  //默认强制男性别
        }
    }

    // 重写Object类中的toString方法
    public String toString() {
        String str = "";
        for (int i = 0; i < 2; i++) {  // for循环打印输出两行任务
            str += "姓名：" + this.getName() + " 年龄：" + this.getAge() + " 性别:" + this.getSex() + "\n";
        }
        return str;
    }
}
