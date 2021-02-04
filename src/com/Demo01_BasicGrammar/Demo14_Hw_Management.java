package com.Demo01_BasicGrammar;

import java.util.Scanner;

public class Demo14_Hw_Management {
    // 插入数据
    public int[] insertData() {
        int[] Array = new int[100];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            System.out.println("请输入数据(输入N结束):");
            Array[i] = in.nextInt();
        }
        return Array;
    }

    // 显示数据
    public void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+ " ");
        }
    }

    // 查询偶数数字
    public void findEvenNumber(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                System.out.print(Array[i] + " ");
            }
        }
    }

    public void notice() {
        System.out.println("-----------------------");
        System.out.println("01-插入数据");
        System.out.println("02-显示数据");
        System.out.println("03-查询偶数数字");
        System.out.println("04-退出");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // 创建类对象
        Demo14_Hw_Management obj = new Demo14_Hw_Management();
        Scanner in = new Scanner(System.in);

        int a[] = null;

        while (true) {
            obj.notice();
            System.out.println("请输入要处理的数字");
            int input = in.nextInt();
            if (input == 04) break;
            switch (input){
                case 01:
                    a = obj.insertData();
                    break;
                case 02:
                    obj.printArray(a);
                    break;
                case 03:
                    obj.findEvenNumber(a);
                    break;
            }

        }

    }
}
