package com.Demo13_File.Demo03_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/com/Demo13_File/Demo01_FileInputStream/static/a.tx");
            InputStreamReader isr = new InputStreamReader(fis);
            int n = 0;
            char[] cbuf = new char[1024];  // 字符流是char数组；字节流是byte数组
//            while ((n = isr.read()) != -1) {
//                System.out.print((char) n);
//            }
            while ((n = isr.read(cbuf)) != -1) {
                String s = new String(cbuf);
                System.out.println(s);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
