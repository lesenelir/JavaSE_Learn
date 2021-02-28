package com.Demo09_gather.HashSet;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        // 定义猫对象
        Cat one = new Cat("花花", 1, "英短");
        Cat two = new Cat("PP", 2, "黑猫");
        // 定义HashSet，并存放数据
        Set set = new HashSet();
        set.add(one);
        set.add(two);

        // 显示遍历
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 查找HashSet信息
        boolean flag = false;
        Cat c = null;
        while (it.hasNext()) {
            c = (Cat)it.next();
            if (c.getName().equals("PP")) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("PP找到了");
            System.out.println(c);
        } else {
            System.out.println("PP没找到");
        }




    }
}
