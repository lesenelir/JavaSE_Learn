package com.Demo01_BasicGrammar;

public class Demo09_Hw_BubbleSort {
    public static void main(String[] args) {
        int[] a = {12, 34, 21, 56, 1, -2, 100};

        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 冒泡排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i -1; j++) {
                int temp;
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
