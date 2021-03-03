package com.Demo13_File.Demo02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        // 字节文件输出流多用于文件的拷贝
        try {
            FileInputStream fis = new FileInputStream("src/com/Demo13_File/Demo02_FileOutputStream/miaobaobao01.jpg");
            FileOutputStream fos = new FileOutputStream("src/com/Demo13_File/Demo02_FileOutputStream/Copy.jpg");
            int n = 0;
            byte[] b = new byte[1024];

            while ((n = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
