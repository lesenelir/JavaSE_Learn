package com.Demo05_Poly_BigHwProj;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        boolean flag = true;

        while (flag) {
            System.out.println("======== 欢迎来到太阳马戏团 ========");
            System.out.println("======== 请选择表演者 ========");
            System.out.println("========= 1.棕熊 ========");
            System.out.println("========= 2.狮子 ========");
            System.out.println("========= 3.猴子 ========");
            System.out.println("========= 4.鹦鹉 ========");
            System.out.println("========= 5.小丑 ========");

            Scanner in = new Scanner(System.in);
            System.out.println("请输入数字选择的表演者");
            int n = in.nextInt();

            switch (n) {
                case 1:
                    Bear bear = new Bear("Bill", 1);
                    bear.act();
                    break;
                case 2:
                    Lion lion = new Lion("Lain",2,"灰色","公狮");
                    lion.act();
                    break;
                case 3:
                    Monkey monkey = new Monkey("Tom", 1, "金丝猴");
                    monkey.act();
                    break;
                case 4:
                    Parrot parrot = new Parrot("Rose", 1, "牡丹鹦鹉");
                    parrot.act();
                    break;
                case 5:
                    Clown clown = new Clown("Kahle", 5);
                    clown.act();
                    break;
                default:
                    System.out.println("没有该数字的表演者，请重新选择！");
                    break;
            }

            boolean flag2 = true;

            while (flag2) {
                System.out.println("======== 是否继续观看（1/0）========");
                int temp = in.nextInt();
                if (temp == 1) {
                    flag = true;
                    break;
                } else if (temp == 0) {
                    flag = false;
                    System.out.println("======== 欢迎下次光临 ========");
                    break;
                } else {
                    System.out.println("======== 输入信息不正确 ========");
                }
            }


        }


    }
}
