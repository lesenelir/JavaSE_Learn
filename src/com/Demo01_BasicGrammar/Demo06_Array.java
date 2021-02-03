package com.Demo01_BasicGrammar;

import java.util.Arrays;

public class Demo06_Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = a.length - i;
        }
        System.out.println(a);  // 打印数组引用值

        for (int element:
             a) {
            System.out.printf("%d ", element);
        }

        System.out.println();

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
            if (i == a.length - 1) System.out.println();
        }
        System.out.println(Arrays.toString(a));  // 打印数组

        // 字符串数组
        String[] Sizes = {"s", "m", "L", "XL", "XXL"};
        //Arrays类使用
        System.out.println(Arrays.toString(Sizes));
        String[] SizesSecond = Arrays.copyOfRange(Sizes, 0, 3);  // Arrays.copyOf(原数组, 原数组长度) ===> 拷贝数组
        System.out.println(Arrays.toString(SizesSecond));


    }
}
