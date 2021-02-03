package com.Demo01_BasicGrammar;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo05_BigNumber {
    public static void main(String[] args) {
        // static BigInteger valueOf(long x)  返回值等于x的大整数
        BigInteger a = BigInteger.valueOf(100);
        a = a.add(BigInteger.valueOf(1));
        a = a.subtract(BigInteger.valueOf(2));
        System.out.println(a);

        BigDecimal ax = BigDecimal.valueOf(100.1);
        ax = ax.multiply(BigDecimal.valueOf(2));
        System.out.println(ax);

    }
}
