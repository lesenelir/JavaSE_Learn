package com.Demo04_Poly;

public class Poly01 {

    // 向上转型：父类引用指向子类实例：可以自动调用子类重写父类的方法以及父类派生的方法，无法调用子类独有的方法
    //         此时调用父类重写的方法，是子类的方法

    public static void main(String[] args) {
        Sup sup =new Sub();
        sup.m1();
        System.out.println(sup.i);
//		System.out.println(sup.a);
    }

}
//父类
class Sup{
    int i = 10;
    public void m1(){
        System.out.println("父类成员方法");
    }
}

//子类
class Sub extends Sup{
    int i = 20;
    int a = 1;
    public void m1(){
        System.out.println("子类成员方法");
    }
}