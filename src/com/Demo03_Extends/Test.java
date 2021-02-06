package com.Demo03_Extends;

public class Test {
    public static void main(String[] args) {
        Work work = new Work();
        TestWork testWork = new TestWork("测试工作类", 10, 5);
        DevelopmentWork developmentWork = new DevelopmentWork("研发工作类", 1000, 10);

        work.printInfo();
        testWork.printInfo();
        developmentWork.printInfo();

    }
}
