package com.Demo07_WrapperClass;

public class WrapperTest02 {
    public static void main(String[] args) {
        // 基本数据类型转换成字符串
        int t1 = 2;
        String t2 = Integer.toString(t1);
        // 测试
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("====================");

        // 字符串转换成基本数据类型
        // 1. 使用包装类的parse方法
        int t3 = Integer.parseInt(t2);  // 【推荐使用】
        // 2.
        int t4 = Integer.valueOf(t2);
        // 测试
        System.out.println(t3);
        System.out.println(t4);
    }
}
