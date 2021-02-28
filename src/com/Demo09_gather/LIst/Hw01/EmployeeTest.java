package com.Demo09_gather.LIst.Hw01;


import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        // 创建ArrayList对象
        List list = new ArrayList();
        // 创建三个Employee对象
        Employee one = new Employee(1, "张三", 5000.0);
        Employee two = new Employee(2, "李四", 5500.0);
        Employee three = new Employee(3, "赵六", 4000.0);
        
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println("员工姓名" + " 员工薪资");
        for (int i = 0; i < list.size(); i++) {
//            ((Employee)(list.get(i))).getName();
            System.out.println(((Employee)list.get(i)).getName() + " " + ((Employee)list.get(i)).getSalary());
        }
    }
}
