package com.Demo10_gatherSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01_IntSort {
    public static void main(String[] args) {
        // 对存储在List中的整形数据进行排序  ---->  使用【Collections类中的sort方法进行排序】
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(10);
        list.add(4);
        list.add(3);

        System.out.println("排序前的顺序：");
        for (int n: list) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("排序后的顺序：");
        Collections.sort(list);
        for (int n: list) {
            System.out.print(n + " ");
        }

    }
}
