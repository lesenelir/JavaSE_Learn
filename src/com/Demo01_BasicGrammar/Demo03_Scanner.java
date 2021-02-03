package com.Demo01_BasicGrammar;

import java.util.Scanner;

public class Demo03_Scanner {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);

        System.out.println("Whats your name");
        String name = ins.nextLine();   // nextLine()读取包含空格

        System.out.println("How old are you");
        int age = ins.nextInt();

        System.out.println("Whats your last name");
        String lastName = ins.next();   // next()读取不包含空格

        System.out.println(name + " is " + age + " years old and the last name is " + lastName);

//        ins.hasNext();   // 检测输入中是否还有其他单词


    }
}
