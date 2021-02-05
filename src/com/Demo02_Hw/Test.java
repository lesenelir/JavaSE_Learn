package com.Demo02_Hw;

public class Test {
    public static void main(String[] args) {
        Department dp = new Department();
        Department dt1 = new Department("A001", "人事部");
        Department dt2 = new Department("A002", "市场部");

        Work job1 = new Work("A", "经理");
        Work job2 = new Work("A", "助理");
        Work job3 = new Work("A", "职员");
        Work job4 = new Work("B", "职员");
        Work job5 = new Work("B", "经理");
        Work job6 = new Work("B", "职员");
        Employee sf1 = new Employee("张铭", "S001", 29, "男", dt1, job1);
        Employee sf2 = new Employee("李爱哎", "S002", 29, "男", dt1, job2);
        Employee sf3 = new Employee("孙超", "S003", 29, "男", dt2, job3);
        Employee sf4 = new Employee("张妹妹", "S004", 29, "男", dt2, job4);
        Employee sf5 = new Employee("蓝迪", "S005", 29, "男", dt2, job5);
        Employee sf6 = new Employee("米粒", "S006", 29, "男", dt2, job6);

        System.out.println(sf1.introduction());
        System.out.println(sf2.introduction());
        System.out.println(sf3.introduction());
        System.out.println(sf4.introduction());
        System.out.println(sf5.introduction());
        System.out.println(sf6.introduction());
        //测试每个部门分别有多少学生
        dt1.addEmployee(sf1);
        dt1.addEmployee(sf2);
        dt1.addEmployee(sf3);
        dt2.addEmployee(sf4);
        dt2.addEmployee(sf5);
        //	dt2.addStaff(sf6);
        //总人数为
        System.out.println("市场部总公有" + dt2.getEmployeeNum() + "名员工");
        System.out.println("人事部总公有" + dt1.getEmployeeNum() + "名员工");


    }
}
