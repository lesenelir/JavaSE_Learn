package com.Demo02_Class;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo01_Calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        DayOfWeek weekday = date.getDayOfWeek();  // 得到当前的星期，返回一个DateOfWeek实例
        int value = weekday.getValue();  // 1=monday ... 7=sunday

        System.out.println(month);
        System.out.println(today);
        System.out.println(value);

    }
}
