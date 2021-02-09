package com.Demo04_Poly.PolyProj01;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal();
        // 向上转型、隐式转型、自动转型  ----> 父类引用指向子类实例对象
        Animal two = new Cat();
        Animal three = new Dog();

        /*
         *   向上转型：父类引用指向子类实例：可以自动调用子类重写父类的方法以及父类派生的方法，无法调用子类独有的方法
         *                          此时调用父类重写的方法，是子类的方法
         *   小类转成大类
         *      【注意】父类的static静态方法无法被子类重写，所以向上转型后，只能调用到父类原有的静态方法
         * */

        one.eat();
        two.eat();
        two.setMonth(2);
        two.say();   // 此时调用父类的say方法
        System.out.println(two.getMonth());
//        two.run(); // 报错，向上转型不能调用子类的特有的方法
        three.eat();

        System.out.println("==================");

        // 向下转型  （强制类型转换）
        /* 子类引用指向父类对象，此处必须进行强制类型转换，可以调用子类特有的方法
        *   instanceof关键字：判断某个对象是否满足某个特定的类型  返回：true/false
        * */

        if (two instanceof Cat) {
            Cat temp = (Cat) two;  // two一开始是Animal类型，此条语句把其转换成Cat类型语句
            temp.eat();
            temp.run();
            System.out.println(temp.getMonth());
            System.out.println("two可以转换为Cat类型");
        }

    }
}
