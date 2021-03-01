package com.Demo09_gather.Map;

public class Goods {
    private String id;
    private String name;
    private double price;

    // constructor
    public Goods() {
    }

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // getter | setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toSrtring方法重写

    @Override
    public String toString() {
        return "Goods{" +
                "商品ID：'" + id + '\'' +
                ", 商品名字：'" + name + '\'' +
                ", 商品价格：" + price +
                '}';
    }
}
