package com.Demo09_gather.LIst;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo02_Set {
    public static void main(String[] args) {
        // Set 是元素无序，并且不可重复的集合，被称为集
        // HashSet是Set的重要实现类，称为哈希集，HashSet元素无序，并且不可重复

        Set set = new HashSet();
        set.add("red");
        set.add("blue");
        set.add("white");

        // 1.迭代器遍历Set集合元素
        Iterator it = set.iterator();
        while (it.hasNext()) {      //迭代器
            System.out.println(it.next());
        }

        System.out.println("==========");
        // 2.插入元素
        set.add("black");
        it = set.iterator();   // 【重新插入元素要重新设置迭代器】
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("==========");
        // 3.插入重复元素 不重复显示
        set.add("red");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
