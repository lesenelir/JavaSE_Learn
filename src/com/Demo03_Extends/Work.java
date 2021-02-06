package com.Demo03_Extends;

public class Work {
    private String workName;

    // 无参构造方法
    public Work() {
    }

    public Work(String workName) {
        this.workName = workName;
    }

    // getter/setter方法
    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    // 工作父类方法
    public void printInfo() {
        System.out.println("父类信息测试：开心工作");
    }
}
