package com.Demo01_BasicGrammar;

public class Demo10_Hw_DrawPic {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // 输出空格
            for (int j = 1; j <= 2*(5-i)+1; j++) {
                System.out.print(" ");
            }
            // 输出字符
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
