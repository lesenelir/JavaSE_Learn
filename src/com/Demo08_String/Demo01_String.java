package com.Demo08_String;

public class Demo01_String {
    public static void main(String[] args) {
        String str = "Making Love Out Of Nothing At All";

        // 1. 求字符串长度
        System.out.println(str.length());

        // 2. 求字符串指定位置字符
        System.out.println(str.charAt(7));

        // 3. 求子串
        System.out.println(str.substring(0));
        System.out.println(str.substring(7, 11));

        // 4. 求字符、字符串第一次出现的位置
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf("Of"));

        // 5. 求字符、字符串最后一次出现的位置
        System.out.println(str.lastIndexOf('A'));
        System.out.println(str.lastIndexOf("ot"));
    }
}
