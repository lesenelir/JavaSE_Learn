package com.Demo03_Extends.Hw01;


// 研发工作类
public class DevelopmentWork extends Work {
    private int codeNum;
    private int nobugNum;

    // 构造方法
    public DevelopmentWork() {
    }

    public DevelopmentWork(String workName, int codeNum, int nobugNum) {
        super(workName);
        this.codeNum = codeNum;
        this.nobugNum = nobugNum;
    }

    // getter/setter方法
    public int getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(int codeNum) {
        this.codeNum = codeNum;
    }

    public int getNobugNum() {
        return nobugNum;
    }

    public void setNobugNum(int nobugNum) {
        this.nobugNum = nobugNum;
    }

    // 重写父类方法
    public void printInfo() {
        System.out.println(super.getWorkName() + "的日报是：今天编写了" + this.codeNum + "行代码，目前还有" + this.nobugNum + "bug没有解决");
    }

}
