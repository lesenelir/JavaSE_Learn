package com.Demo03_Extends.Hw01;

// 测试工作类
public class TestWork extends Work {
    private int testNum;
    private int bugNum;

    // 构造方法
    public TestWork() {
    }

    public TestWork(String workName, int testNum, int bugNum) {
        super(workName);
        this.testNum = testNum;
        this.bugNum = bugNum;
    }

    public TestWork(int testNum, int bugNum) {
        this.testNum = testNum;
        this.bugNum = bugNum;
    }

    // getter/setter方法
    public int getTestNum() {
        return testNum;
    }

    public void setTestNum(int testNum) {
        this.testNum = testNum;
    }

    public int getBugNum() {
        return bugNum;
    }

    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    // 重写父类方法
    public void printInfo() {
        System.out.println(super.getWorkName() + "的日报是：今天编写了" + this.testNum + "个测试用例，发现了" + this.bugNum + "bug");
    }

}
