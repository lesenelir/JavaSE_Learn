package com.Demo02_Hw;


// 职务类
public class Work {
    private String workID;
    private String workName;

    // 构造方法
    public Work() {
    }

    public Work(String workID, String workName) {
        this.workID = workID;
        this.workName = workName;
    }

    // getter/setter方法
    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

}
