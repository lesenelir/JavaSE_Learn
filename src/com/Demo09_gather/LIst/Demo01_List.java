package com.Demo09_gather.LIst;

import java.util.ArrayList;
import java.util.List;

public class Demo01_List {
    public static void main(String[] args) {

        // List是元素有序并且可以重复的序列，成为序列
        // ArrayList底层是由数组实现的，它的长度不是固定的，可以动态增加或减少


        List list = new ArrayList();
        list.add("java");
        list.add("C++");
        list.add("C");
        list.add("go");
        list.add("swift");

        // 输出列表中元素的个数
        System.out.println(list.size());
        
        // 遍历数组所有元素
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        // 移除某个元素值 remove方法
        list.remove(2);     // 用下标来移除元素
        list.remove("go");    // 用单个元素来移除元素
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
