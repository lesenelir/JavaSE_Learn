package com.Demo09_gather.HashSet.Hw02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        // 定义三个Student类的对象
        Student one = new Student(3, "William", 65);
        Student two = new Student(1, "Tom", 87);
        Student three = new Student(2, "Lucy", 95);

        // 定义HashSet
        Set set = new HashSet();
        set.add(one);
        set.add(two);
        set.add(three);

        // 迭代器遍历HashSet结果
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("===============");
        // 添加相同的元素   【要重写hashcode和equals方法才能不添加相同的元素】
        Student four = new Student(3, "William", 65);
        set.add(four);
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
