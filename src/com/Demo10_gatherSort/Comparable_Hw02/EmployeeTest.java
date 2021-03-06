package com.Demo10_gatherSort.Comparable_Hw02;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        // 创建Employee员工对象
        Employee one = new Employee("emp001", "张三", 1800);
        Employee two = new Employee("emp002", "李四", 2500);
        Employee three = new Employee("emp003", "王五", 1600);

        // 定义list
        List<Employee> list = new ArrayList<Employee>();
        list.add(one);
        list.add(two);
        list.add(three);

        System.out.println("排序前的顺序：");
        for (Employee employee: list) {
            System.out.print(employee + " ");
        }

        System.out.println();
        System.out.println("排序后的顺序：");
        Collections.sort(list);
        for (Employee employee: list) {
            System.out.print(employee + " ");
        }

    }
}
