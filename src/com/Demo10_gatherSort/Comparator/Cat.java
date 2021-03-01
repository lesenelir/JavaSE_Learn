package com.Demo10_gatherSort.Comparator;

public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat() {
    }

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // toString

    @Override
    public String toString() {
        return "[" +
                "名字：'" + name + '\'' +
                ", 月份：" + month +
                ", 种类：'" + species + '\'' +
                ']';
    }
}
