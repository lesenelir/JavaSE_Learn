package com.Demo02_Hw;

public class Employee {
    private String EmployName;
    private String EmployId;
    private int EmployAge;
    private String EmploySex;
    private Department EmployDepartment;
    private Work EmployWork;

    // 构造方法
    public Employee() {
    }

    public Employee(String employName, String employId, int employAge, String employSex) {
        EmployName = employName;
        EmployId = employId;
        EmployAge = employAge;
        EmploySex = employSex;
    }

    public Employee(String employName, String employId, int employAge, String employSex, Department employDepartment, Work employWork) {
        EmployName = employName;
        EmployId = employId;
        EmployAge = employAge;
        EmploySex = employSex;
        EmployDepartment = employDepartment;
        EmployWork = employWork;
    }

    // getter/setter方法
    public String getEmployName() {
        return EmployName;
    }

    public void setEmployName(String employName) {
        EmployName = employName;
    }

    public String getEmployId() {
        return EmployId;
    }

    public void setEmployId(String employId) {
        EmployId = employId;
    }

    public int getEmployAge() {
        return EmployAge;
    }

    public void setEmployAge(int employAge) {
        if (employAge < 18 || employAge > 60) {
            employAge = 18;
        } else {
            EmployAge = employAge;
        }
    }

    public String getEmploySex() {
        return EmploySex;
    }

    public void setEmploySex(String employSex) {
        if (employSex.equals("男") || employSex.equals("女")) {
            EmploySex = employSex;
        } else {
            // 非法性别则强制设置为男
            this.EmploySex = "男";
        }
    }

    public Department getEmployDepartment() {
        return EmployDepartment;
    }

    public void setEmployDepartment(Department employDepartment) {
        EmployDepartment = employDepartment;
    }

    public Work getEmployWork() {
        return EmployWork;
    }

    public void setEmployWork(Work employWork) {
        EmployWork = employWork;
    }

    public String introduction() {
        String str = "\n员工姓名:" + this.getEmployName() + "\n员工工号:" + this.getEmployId() + "\n员工年龄:" + this.getEmployAge()
                + "\n员工性别:" + this.getEmploySex() + "\n职务:"+this.getEmployDepartment().getDepName()
                +this.getEmployWork().getWorkName();
        return str;
    }

}
