package com.Demo06_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo02 {
    public static void main(String[] args) {
        /*
        try {
            int res = test();
            System.out.println("两个数字除法结果：" + res);
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为零");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        }
        */

        // 通常在声明处用throws子句来声明抛出异常
        // throws语句用在方法定义时声明该方法要抛出的异常类型


        try {
            int res = test();
            System.out.println("两个数字除法结果：" + res);
        } catch (Exception e) {
            System.out.println("程序出现异常");
        }
    }

    /*
    *  通过throws抛出异常时，针对可能出现的多种异常情况，解决方案：
    *  1. throws 后面接多个异常类型，中间用逗号分隔
    *  2. throws 后面接Exception类
    * */

//    public static int test() throws ArithmeticException, InputMismatchException {
//        Scanner in = new Scanner(System.in);
//        System.out.println("======程序开始运行======");
//
//        System.out.println("请输入第一个数字：");
//        int one = in.nextInt();
//        System.out.println("请输入第二个数字：");
//        int two = in.nextInt();
//        System.out.println("======运算结束======");
//        return one / two;
//    }


    public static int test() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("======程序开始运行======");

        System.out.println("请输入第一个数字：");
        int one = in.nextInt();
        System.out.println("请输入第二个数字：");
        int two = in.nextInt();
        System.out.println("======运算结束======");
        return one / two;
    }
}