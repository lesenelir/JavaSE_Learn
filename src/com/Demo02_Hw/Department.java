package com.Demo02_Hw;

public class Department {
    private String depId;
    private String depName;
    private Employee[] employeesArray = new Employee[100];  //获取部门类员工的数组，定义一个员工类的数组
    private int employeeNum;

    // 构造方法
    public Department() {
    }

    public Department(String depId, String depName) {  // 部门自身的属性【常用】
        this.depId = depId;
        this.depName = depName;
    }

    public Department(String depId, String depName, Employee[] employeesArray, int employeeNum) {
        this.depId = depId;
        this.depName = depName;
        this.employeesArray = employeesArray;
        this.employeeNum = employeeNum;
    }

    // getter/setter方法
    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee[] getEmployeesArray() {  // 返回员工  this.getEmployeesArray() == employeesArray[]
        return employeesArray;
    }

    public void setEmployeesArray(Employee[] employeesArray) {  // 修改数组
        this.employeesArray = employeesArray;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    // 统计员工
    public void addEmployee(Employee el) {  // 传入员工对象
        /*
            将员工保存到数组中、统计员工个数保存在employeeNum变量中
        * */
        for (int i = 0; i < this.getEmployeesArray().length; i++) {
            if (this.getEmployeesArray()[i] == null) {
                this.getEmployeesArray()[i] = el;
                this.employeeNum = i + 1;
            }
            return;
        }
    }

}
