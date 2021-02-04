package com.Demo01_BasicGrammar;

import java.util.Scanner;

public class Demo08_Hw_vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input an alphabet");
        // Java中读取单个字母   next()适用于读取不包含空格
        char ch = in.next().charAt(0);
        // switch语句
        switch (ch) {
            case 'a':
                System.out.println(ch + " is a vowel number");
                break;
            case 'e':
                System.out.println(ch + " is a vowel number");
                break;
            case 'i':
                System.out.println(ch + " is a vowel number");
                break;
            case 'o':
                System.out.println(ch + " is a vowel number");
                break;
            case 'u':
                System.out.println(ch + " is a vowel number");
                break;
            default:
                System.out.println(ch + " is not a vowel number");
                break;
        }
    }
}
