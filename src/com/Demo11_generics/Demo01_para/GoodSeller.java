package com.Demo11_generics.Demo01_para;

import java.util.List;

public class GoodSeller {
    // 把泛型当作方法的参数进行传递
    public void sellGoods(List<? extends Goods> goods) {
        for (Goods g: goods) {
            g.sell();
        }
    }
}
