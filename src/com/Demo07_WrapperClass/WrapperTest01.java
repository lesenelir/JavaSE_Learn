package com.Demo07_WrapperClass;

public class WrapperTest01 {
    public static void main(String[] args) {
        // 装箱：把数据类型转换成包装类
        // 1. 自动装箱
        int t1 = 2;
        Integer t2 = t1;
        // 2. 手动装箱
        Integer t3 = new Integer(t1);


        // 测试
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("==========");


        // 拆箱： 把包装类转换成基本数据类型
        // 1. 自动拆箱
        int t4 = t2;

        // 2. 手动拆箱
        int t5 = t2.intValue();   // 会出现黄色的警告意味着可以直接省略去黄色的内容
        // 测试
        System.out.println(t4);
        System.out.println(t5);

        double t6 = t2.doubleValue();  // 【手动拆箱多用于把包装类数据转换成不同的数据类型如：int转换成double】
        System.out.println(t6);


    }
}
