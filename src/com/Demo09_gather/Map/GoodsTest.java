package com.Demo09_gather.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        // 1.定义HashMap存储对象类
        Map<String, Goods> goodsMap = new HashMap<>();

        Scanner in = new Scanner(System.in);

        System.out.println("请输入三条商品信息：");
        // 2.插入数据
        for (int i = 0; i <3; i++) {
            System.out.println("请输入第" + (i + 1) + "条信息");
            System.out.println("请输入商品编号：");
            String goodsId = in.next();
            // 判断商品ID是否存在
            if (goodsMap.containsKey(goodsId)) {
                System.out.println("商品编号已经存在，请重新输入");
                continue;
            }
            System.out.println("请输入商品名字：");
            String goodsName = in.next();
            System.out.println("请输入商品价格：");
            double goodsPrice = 0;
            try {
                goodsPrice = in.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("格式输入不正确，请重新输入数值型数据");
                in.next();
                continue;
            }
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            goodsMap.put(goodsId, goods);
        }

        // 3.显示数据
        System.out.println("遍历输出商品的全部信息：");
        Iterator<Goods> itGoods = goodsMap.values().iterator();    // 迭代器后面跟泛型，表示迭代器内存储的都是Goods对象的内容
        while (itGoods.hasNext()) {
            System.out.println(itGoods.next());
        }

    }
}
