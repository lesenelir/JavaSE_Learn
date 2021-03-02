package com.Demo12_Thread.Hw03;

public class Letter implements Runnable {

//
//    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
//            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    char[] letters = new char[26];

    // 无参数构造方法用于：创建类对象时候，直接对字符数组进行赋值
    public Letter() {
        for (int i = 0; i < letters.length; i++) {
            // 进行ASII码进行赋值，
            letters[i] = (char)('a' + i);  // 进行强制类型转换
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
