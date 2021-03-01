package com.Demo10_gatherSort.Comparator_Hw01;

public class Employee {
    private String id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(String id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // toString

    @Override
    public String toString() {
        return "员工[" +
                "编号：'" + id + '\'' +
                ", 姓名：'" + name + '\'' +
                ", 工资：" + salary +
                ']';
    }
}
