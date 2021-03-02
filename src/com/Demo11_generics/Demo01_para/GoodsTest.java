package com.Demo11_generics.Demo01_para;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        // 定义book相关的List
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());
        books.add(new Book());

        // 定义clothes相关的List
        List<Clothes> clothes = new ArrayList<Clothes>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());

        // 定义shoes相关的List
        List<Shoes> shoes = new ArrayList<Shoes>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodSeller goodSeller = new GoodSeller();
        goodSeller.sellGoods(books);
        goodSeller.sellGoods(clothes);
        goodSeller.sellGoods(shoes);


    }
}