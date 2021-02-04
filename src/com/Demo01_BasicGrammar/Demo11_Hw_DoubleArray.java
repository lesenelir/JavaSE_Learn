package com.Demo01_BasicGrammar;

import java.util.Scanner;

public class Demo11_Hw_DoubleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 二维数组注意 Array.length 和 Array[i].length

        int [][] Array = new int[3][2];
        for (int i = 0; i < Array.length; i++) {  // 学生数量
            for (int j = 0; j < Array[i].length; j++) {
                if (j == 0) {
                    System.out.println("请输入第" + (i + 1) + "个学生的语文成绩");
                    Array[i][j] = in.nextInt();
                } else {
                    System.out.println("请输入第" + (i + 1) + "个学生的数学成绩");
                    Array[i][j] = in.nextInt();
                }
            }
        }

        int chineseSumScore = 0;
        int mathSumScore = 0;
        for (int i = 0; i < Array.length; i++) {
            chineseSumScore += Array[i][0];
            mathSumScore += Array[i][1];
        }
        System.out.println("语文总成绩" + chineseSumScore);
        System.out.println("数学总成绩" + mathSumScore);
    }
}
