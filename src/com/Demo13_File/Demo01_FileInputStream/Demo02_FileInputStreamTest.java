package com.Demo13_File.Demo01_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02_FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/com/Demo13_File/Demo01_FileInputStream/static/a.txt");
            byte[] b = new byte[100];
            fileInputStream.read(b);
            System.out.println(new String(b));
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
