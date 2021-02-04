package com.Demo02_Class;

public class Demo04_Hw_ProblemPerson {
    int age = 10;
    String name = "Tony";

    // 该函数不是构造函数，这是一个普通的与类名相同的函数
    // 【推广】： 对于一个普通函数名可以选择与类名相同
    public void Demo04_Hw_ProblemPerson(int age, String name) {
        age = age;
        name = name;
        System.out.println(this.name + " " + this.age);
    }

    public void eat() {
        System.out.println("起床吃饭了");
    }

    public static void main(String[] args) {
//        new Demo04_Hw_ProblemPerson(20, "Angela").eat();
        // 此处出现错误，因为没有双参数的构造函数
    }
}
