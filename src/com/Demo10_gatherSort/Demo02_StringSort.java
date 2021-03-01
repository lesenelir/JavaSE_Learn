package com.Demo10_gatherSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo02_StringSort {
    public static void main(String[] args) {
        // 对存储在List中的字符串数据进行排序  ---->  使用【Collections类中的sort方法进行排序】
        // 对于字符串排序是按照ASII码值进行排序

        List<String> list = new ArrayList<String>();

        list.add("orange");
        list.add("red");
        list.add("white");
        list.add("blue");

        System.out.println("排序前的顺序：");
        for (String s: list) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("排序后的顺序：");
        Collections.sort(list);
        for (String s: list) {
            System.out.print(s + " ");
        }

    }
}
