package com.Demo06_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo01 {
    public static void main(String[] args) {
        System.out.println("======程序开始运行======");
        try {
            System.out.println("请输入第一个数字：");
            Scanner in = new Scanner(System.in);
            int one = in.nextInt();
            System.out.println("请输入第二个数字：");
            int two = in.nextInt();
            System.out.println("两个数字的除数one/two结果是：" + (one/two));
        } catch (ArithmeticException e) {
//            System.exit(1);  // 终止程序执行 程序不会执行finally方法体的内容
            System.out.println("除数不允许为零");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        } catch (Exception e) {   // 多重catch语句执行的时候，最后大类的Exception语句要放在最后一个catch语句中
            System.out.println("程序出错啦～～～");
            e.printStackTrace();
        } finally {
            System.out.println("======程序结束运行======");
        }

    }
}
