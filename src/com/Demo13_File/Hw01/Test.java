package com.Demo13_File.Hw01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/com/Demo13_File/Hw01/homework.txt");
            // 方法一
            int n = fis.read();
            int count = 0;   // 统计字节数
            System.out.println("文本内容：");
            while (n != -1) {
                System.out.print((char) n);
                count++;
                n = fis.read();
            }
            System.out.println("统计结果：homework.txt文件中共有" + count + "个字节");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
