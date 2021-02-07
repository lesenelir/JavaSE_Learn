package com.Demo03_Extends.Object;

public class TestEquals {
    public static void main(String[] args) {
        Animal one = new Animal("花花", 2);
        Animal two = new Animal("花花", 2);

        // 对于object类的equals时，比较的是两个引用是否指向同一个对象
        /*
         * 对于子类可以重写父类Object的equals方法
         *
         * */
        System.out.println(one.equals(two)); // false
        System.out.println(one == two); //false

        // 对于String类中重写的equals方法，比较字符串数值内容是否相同
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2);  // true

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3.equals(str4));  // true
        System.out.println(str3 == str4);  // false
    }
}


class Animal {
    private String name;
    private int age;

    // 构造方法
    public Animal() {
    }

    public Animal(String name, int age) {
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

    // 重写父类Object中的equals方法
    /*
    public boolean equals(Animal obj) {  // 比较对象中的obj内容
        if (obj == null) {
            return false;
        }
        if (this.getName().equals(obj.getName()) && (this.getAge() == obj.getAge())) {
            return true;
        } else {
            return false;
        }
    }
    */


}