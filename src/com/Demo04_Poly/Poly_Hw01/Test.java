package com.Demo04_Poly.Poly_Hw01;

public class Test {
    public static void main(String[] args) {
        // 生成长度为5的动物类数组
        Animal[] animals = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            int n = (int) (Math.random() * 3);
            switch (n) {
                case 0: animals[i] = new Cat();
                        break;
                case 1: animals[i] = new Dog();
                        break;
                case 2: animals[i] = new Sheep();
                        break;
            }
        }

        // 此时Animal数组已经存放了各类的向上转型的对象
        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals[i]);
//            animals[i].cry();
            if (animals[i] instanceof Cat) {
                Cat temp = (Cat) animals[i];
                temp.cry();
            } else if (animals[i] instanceof Dog) {
                Dog temp = (Dog) animals[i];
                temp.cry();
            } else if (animals[i] instanceof Sheep) {
                Sheep temp = (Sheep) animals[i];
                temp.cry();
            }
        }

    }
}
