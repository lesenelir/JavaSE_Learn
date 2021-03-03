package com.Demo13_File.Demo01_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01_FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/com/Demo13_File/Demo01_FileInputStream/static/a.txt");

            int n = fileInputStream.read();

            while (n != -1) {   // -1表示读取到文件的末尾
                System.out.print((char)n);
                n = fileInputStream.read();
            }

            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
