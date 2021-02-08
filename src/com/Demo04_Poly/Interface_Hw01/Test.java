package com.Demo04_Poly.Interface_Hw01;

public class Test {
    public static void main(String[] args) {
//        Plane plane = new Plane();
//        plane.fly();
        // 接口指向实现类，接口的引用指向具体接口实现类
        // 此时，只能调用接口中的具体方法，如果没有要调用实现类的独有方法，需强制类型转换
        IFly plane = new Plane();
        plane.fly();

        IFly bird = new Bird();
        bird.fly();

        IFly balloon = new Balloon();
        balloon.fly();
//        balloon.printInfo();  // 接口引用指向具体实现类不能指向接口中没有的方法，如果需要调用类的独有方法，需要强制类型转换
        ((Balloon) balloon).printInfo();
    }
}
