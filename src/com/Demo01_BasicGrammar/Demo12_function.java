package com.Demo01_BasicGrammar;

public class Demo12_function {

    /* 方法的定义只能定义在类中，不能进行方法的嵌套
    *
    *
    *
    * */

    // 普通有参数有返回值类型的方法
    public int fac(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // 2.数组作为参数的方法
    public void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]  + " ");
        }
    }

    // 3.带有可变参数的方法
    public int sum(int... n) {
        int res = 0;
        for (int el: n) {
            res += el;
        }
        return res;
    }

    public static void main(String[] args) {
        // 创建对象，方法的使用要用对象去调用
        Demo12_function obj = new Demo12_function();
        System.out.println(obj.fac(10));

        int[] a = {1 , 2, 3, 7, 0};
        obj.printArray(a);

        System.out.println(obj.sum(1));
        System.out.println(obj.sum(1 , 2, 3));
    }
}
