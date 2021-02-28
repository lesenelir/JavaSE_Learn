package com.Demo08_String.Hw02_StringBuilder;

public class  Test {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("欢迎来到");
        System.out.println(str.append("imooc"));
        System.out.println(str.delete(0, 4).insert(0,",你好"));
    }
}
