package com.Demo02_Class;

public class Demo02_Hw_StudentClassTest {
    public static void main(String[] args) {
        // 创建实例对象
//        Demo02_Hw_StudentClassTest obj = new Demo02_Hw_StudentClassTest();  // 如果在该类有方法，要使用该类的方法则要创建该类对象
        Person obj = new Person("李明");
        new Person();   // 调用无参构造方法，如果没有调用有参的构造方法，则默认调用无参的构造方法
        obj.sex("male");
        obj.mySelf();
    }
}


class Person {
    private String name;
    private int age;
    private int grade;

    // 无参数构造方法
    public Person() {
        System.out.println("我是一名学生");
    }
    // 含参数的构造方法
    public Person(String name) {
        this.name = name;
    }

    public void sex(String str) {
        if (str.equals("male")) {
            System.out.println("我是一个男孩");
        } else if (str.equals("female")) {
            System.out.println("我是一个女孩");
        }
    }

    public void mySelf() {
        System.out.println("我叫" + this.name + "，今年" + this.age + "，读小学" + this.grade);
    }

}