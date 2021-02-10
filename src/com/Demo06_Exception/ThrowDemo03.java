package com.Demo06_Exception;


// throw用来抛出异常对象

// 方法定义处抛出异常对象 throw
// 方法声明处声明了这个异常类型 throws
// 在方法调用处去进行异常处理 try catch/throws

import java.util.Scanner;

public class ThrowDemo03 {
    public static void main(String[] args) {
        /*
        *  throw抛出异常对象的处理方法
        *   1.通过try...catch包含throw语句 ------> 自己抛自己处理
        *
        *   2.通过throws在方法声明处抛出异常类型  -- 谁调用谁处理 -- 调用者可以自己处理，也可以继续向上继续抛
        *
        * */
        try {
            testAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testAge() throws Exception{  // 在方法处声明异常类型
        System.out.println("请输入年龄");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age < 18 || age > 80) {
            throw new Exception("18岁以下、80岁以上的住客必须由亲友陪同");   // 抛出异常对象
        } else {
            System.out.println("欢迎入住本酒店");
        }
    }


}
