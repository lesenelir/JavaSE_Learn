package com.Demo04_Poly.Poly_Hw01;

public class Animal {
    private String kind;

    // constructor
    public Animal() {
    }

    public Animal(String kind) {
        this.kind = kind;
    }

    // getter/setter function
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    // function own
    public void cry() {
        System.out.println("动物叫声");
    }




}
