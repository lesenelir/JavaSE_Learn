package com.Demo08_String;

public class Demo02_String {
    public static void main(String[] args) {
        // 字符串和byte数组之间的转换
        String str = "Making Love Out Of Nothing At All";
        // 1. 将字符串转换成byte数组，并打印输出
        byte[] arrs = str.getBytes();     // 字符串和byte数组转换涉及 getBytes()方法
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
        // 2. 将byte数组转换成字符串
        String s1 = new String(arrs);  // byte数组名直接存入String类
        System.out.println(s1);
    }
}
