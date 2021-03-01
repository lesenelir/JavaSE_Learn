package com.Demo10_gatherSort.Comparator;

import java.util.Comparator;

// 作为当前比较器类
public class NameComparator implements Comparator<Cat> {   // 出现红色报错【快捷键：】option/alt + return
    @Override
    public int compare(Cat o1, Cat o2) {
        // 按名字进行升序排序
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n = name1.compareTo(name2);   // 字符串的比较用compareTo方法
        return n;
    }
}
