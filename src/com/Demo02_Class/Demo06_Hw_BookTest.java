package com.Demo02_Class;

public class Class06_Hw_BookTest {
    public static void main(String[] args) {
        Books one = new Books("红楼梦", "曹雪芹","人民文学出版社", 8.8);
        Books two = new Books("小李飞刀", "古龙", "中国长安出版社", 55.5);

        // 显示信息
        one.showInfo();

        System.out.println("===========");

        two.showInfo();
    }
}


class Books {
    private String name;
    private String author;
    private String publisher;
    private double price;

    // 构造方法
    public Books(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        // 创建对象后如果图书单价没有10元，强制10元
        if (this.price < 10) {
            System.out.println("图书的价格最少为10元");
            this.price = 10.0;
        }
    }

    // get/set方法
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 显示信息
    public void showInfo() {
        System.out.println("书名："+ this.name);
        System.out.println("作者：" + this.author);
        System.out.println("出版社：" + this.publisher);
        System.out.println("价格：" + this.price);
    }

}
