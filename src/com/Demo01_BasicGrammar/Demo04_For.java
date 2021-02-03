package com.Demo01_BasicGrammar;

public class Demo04_For {
    public static void main(String[] args) {
        stop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "-" + j);
                if (j == 3) break stop;  // 通常break跳出一层循环，此处跳出到指定位置
            }
        }
    }
}
