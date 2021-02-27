package com.Demo07_WrapperClass.Hw01;

public class Test {
    public static void main(String[] args) {
        int score = 100;
        // 自动装箱
        Integer scorewrapper = score;
        // 手动拆箱
        double d1 = scorewrapper.doubleValue();
        long l1 = scorewrapper.longValue();
        // 包装类转换成基本数据类型 拆箱
        int i = scorewrapper;

        // 测试
        System.out.println(scorewrapper);
        System.out.println(d1);
        System.out.println(l1);
        System.out.println(i);
    }
}
