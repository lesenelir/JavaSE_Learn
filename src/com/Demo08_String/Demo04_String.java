package com.Demo08_String;

public class Demo04_String {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Making love out of nothing at all");
        // 添加 append方法
        System.out.println(str.append(',').append(" lesenelir"));
        // 删除 delete方法
        System.out.println(str.delete(0, 7));
    }
}
