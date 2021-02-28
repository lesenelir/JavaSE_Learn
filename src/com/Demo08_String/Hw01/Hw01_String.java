package com.Demo08_String.Hw01;

public class Hw01_String {
    public static void main(String[] args) {
        String str = new String("abcdefg");
        String strSecond = str.substring(2, 5).toUpperCase();
        String res = strSecond.replace("DE", "MM");
        System.out.println(res);

    }
}
