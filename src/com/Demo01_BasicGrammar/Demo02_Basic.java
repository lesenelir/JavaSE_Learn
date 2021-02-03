package com.Demo01_BasicGrammar;

public class Demo02_Basic {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Hello Lesenelir");

        // 测试Math类
        double result = Math.pow(2, 4);
        System.out.println(result);
        double x = 9.9897;
        int nx = (int) Math.round(x);
        System.out.println(nx);

        // 字符串String类
        String s = "Hello";
        System.out.println(s.substring(0, 3));
        System.out.println(s.length());
        System.out.println(s + "Lesenelir");

        // 构建字符串StringBuilder类
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append('L');
        System.out.println(builder);
        builder.setCharAt(5, 'K');  // 修改index处的字符
        System.out.println(builder);
        String s1 = builder.toString();    // 返回一个与构建器或缓冲期内容相同的字符串
        System.out.println(s1);

    }
}
