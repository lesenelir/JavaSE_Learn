package com.Demo09_gather.Map.Hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();  // Map中要用包装类，不能用基本数据类型

        // 1. 添加数据
        map.put(2014, "德国");
        map.put(2010, "西班牙");
        map.put(2006, "意大利");
        map.put(2002, "巴西");
        map.put(1998, "法国");

        // 2.使用迭代器遍历输出
        System.out.println("使用迭代器方式进行输出");
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 3.使用EntrySet方式进行输出
        System.out.println();
        System.out.println("使用EntrySet方式进行输出");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
