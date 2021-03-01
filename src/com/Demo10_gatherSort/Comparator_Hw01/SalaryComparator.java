package com.Demo10_gatherSort.Comparator_Hw01;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // 按照薪资进行降序排序
        float salary1 = o1.getSalary();
        float salary2 = o2.getSalary();
        return (int) salary2 - (int)salary1;
    }
}
