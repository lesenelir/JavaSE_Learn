package com.Demo09_gather.Map;

import java.util.*;

public class Demo01_Test {
    public static void main(String[] args) {
        // 字典例子
        Map<String, String> animal = new HashMap<>();
        System.out.println("请输入三组数据，并存放在HashMap中");

        Scanner in = new Scanner(System.in);
        // 1.添加数据
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入key值（单词）");
            String key = in.next();
            System.out.println("请输入value值（注释）");
            String value = in.next();
            animal.put(key, value);   // 向HashMap中添加数据
        }

        System.out.println("=========");
        // 2.打印输出value值（迭代器方法）
        Iterator<String> it = animal.values().iterator();  // 存储到迭代器
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("=========");
        // 3.打印输出全部的key和value值（通过entryset方法）
        System.out.println("通过entrySet方法得到key和value值");
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> e: entrySet) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println("==========");
        // 4.查找数据。查找单词
        String strSearch = in.next();
        // 4.1 取得KeySet
        Set<String> keySet = animal.keySet();
        // 4.2 遍历KeySet
        for (String key: keySet) {
            if (strSearch.equals(key)) {
                System.out.println("找到了，键值对为：" + key + "-" + animal.get(key));
                break;
            }
        }
    }
}
