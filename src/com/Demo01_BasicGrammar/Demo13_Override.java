package com.Demo01_BasicGrammar;

public class Demo13_Override {

    /*方法的重载，方法名相同，方法的参数个数或者类型不同
    *
    * */

    // 方法的重载
    public int plus(int a, int b) {
        return a + b;
    }

    public double plus(double a, double b) {
        return a + b;
    }

    public int plus(int[] Array) {
        int sum = 0;
        for (int el: Array) {
            sum = sum + el;
        }
        return sum;
    }


    public static void main(String[] args) {
        Demo13_Override obj = new Demo13_Override();

        int m = 1, n = 2;
        System.out.println(obj.plus(m ,n));

        double x = 1.1;
        System.out.println(obj.plus(x, 2.2));


        int[] a = {1, 2, 4, 3};
        System.out.println(obj.plus(a));


    }
}
