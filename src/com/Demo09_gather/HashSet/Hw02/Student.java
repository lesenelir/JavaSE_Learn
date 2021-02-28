package com.Demo09_gather.HashSet.Hw02;

import java.util.Objects;

public class Student {
    private int stuId;
    private String name;
    private float score;

    // constructor
    public Student() {
    }

    public Student(int stuId, String name, float score) {
        this.stuId = stuId;
        this.name = name;
        this.score = score;
    }

    // getter | setter
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    // tostring方法重写，显示的时候直接显示出来
    @Override
    public String toString() {
        return "[" +
                "学号：" + stuId +
                ", 姓名：'" + name + '\'' +
                ", 成绩：" + score +
                ']';
    }

    // 重写hashcode方法和equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuId == student.stuId &&
//                Float.compare(student.score, score) == 0 &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, name, score);
    }
}
