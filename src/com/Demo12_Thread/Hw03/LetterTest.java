package com.Demo12_Thread.Hw03;

public class LetterTest {
    public static void main(String[] args) {
        Letter l = new Letter();
        Thread thread = new Thread(l);
        thread.start();
    }
}
