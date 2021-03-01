package com.Demo10_gatherSort.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        // 创建Goods对象
        Goods one = new Goods("s001", "手机", 2000);
        Goods two = new Goods("s002", "冰箱", 5000);
        Goods three = new Goods("s003", "电视", 3000);

        // 定义List列表
        List<Goods> list = new ArrayList<Goods>();
        list.add(one);
        list.add(two);
        list.add(three);


        System.out.println("排序前的顺序：");
        for (Goods goods: list) {
            System.out.print(goods + " ");
        }

        System.out.println();
        System.out.println("排序后的顺序：");
        Collections.sort(list);
        for (Goods goods: list) {
            System.out.print(goods + " ");
        }

    }
}
