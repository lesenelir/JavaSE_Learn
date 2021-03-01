package com.Demo10_gatherSort.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("huahua", 5, "英短");
        Cat fanfan = new Cat("fanfan", 2, "中猫");
        Cat maomao = new Cat("maomao", 3, "中猫");

        // 定义List
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(huahua);
        catList.add(fanfan);
        catList.add(maomao);

        System.out.println("排序前的顺序：");
        for (Cat cat: catList) {
            System.out.print(cat + " ");
        }

        // 按照名字ASII升序排序
        System.out.println();
        System.out.println("按照名字升序排序后的顺序：");
        Collections.sort(catList, new NameComparator());  // 比较器
        for (Cat cat: catList) {
            System.out.print(cat + " ");
        }

        // 按照年龄降序排序
        System.out.println();
        System.out.println("按照年龄降序排序后的顺序：");
        Collections.sort(catList, new AgeComparator());
        for (Cat cat: catList) {
            System.out.print(cat + " ");
        }

    }
}
