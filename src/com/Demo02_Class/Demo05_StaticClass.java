package com.Demo02_Class;

/*
*   static关键字表明不是属于对象，而是属于类
*   成员变量使用static关键字表明：变量不属于对象，而是属于所在类，多个对象共享同一份数据
*   static修饰方法：这个方法调用就不用创建对象去调用静态方法，只需要类名.静态方法()
*
* */


public class Demo05_StaticClass {
    public static void main(String[] args) {
        Student one = new Student("L", 20);
        Student two = new Student("S", 21);
        one.setRoom("广州");   // 设置静态变量
        System.out.println(one.getName() + " " + one.getAge() + " " + one.getRoom());
        System.out.println(two.getName() + " " + two.getAge() + " " + two.getRoom());

        // 创建对象调用成员方法
        one.method();

        // 不用创建对象直接使用类名.静态方法()  调用静态方法
        Student.methodStatic();

    }
}


class Student {
    private String name;
    private int age;
    // 静态成员变量
    private static String room;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }


    public void method() {
        System.out.println("这是一个成员方法");
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法");
//        System.out.println(name);   // 【注意】 静态方法不能访问非静态
    }


}
