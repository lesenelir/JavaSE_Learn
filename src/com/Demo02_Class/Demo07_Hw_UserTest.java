package com.Demo02_Class;

public class Demo07_Hw_UserTest {
    public static void main(String[] args) {
        User one = new User("Lucky", 123456);
        User two = new User("Mike", 123456);

        System.out.println("======");

        if (one.getName().equals(two.getName()) && one.getPassword() == two.getPassword()) {
            System.out.println("用户名和密码正确");
        } else {
            System.out.println("用户名或密码不正确");
        }

    }
}

class User {
    private String name;
    private int password;

    // 构造方法
    public User(String name, int password) {
        this.name = name;
        this.password = password;
    }

    // getter/setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


}


//class UserManager {
//
//
//    public void check() {
//        if () {
//        } else {
//
//        }
//
//    }
//}
