package com.Demo06_Exception;

public class Test {
    public static void main(String[] args) {
        try {
            int a = 1 - 1;
            System.out.println(a);
            int b = 4 / a;
            int c[] = {1};
            c[100] = 99;
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为零");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }

        /*
        *  运行结果：
        *   0
        *   除数不允许为零
        *
        *  分析：
        *   对于程序运行try内的语句后，当第一次碰到异常后，就退出try语句，执行相对应的catch语句
        * */
    }
}
