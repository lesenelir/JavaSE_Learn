

### String中的equals方法
    在Object类型中，equals()方法相当于==，比较的是地址，是否为同一对象
    在String类中，equals()进行了重写，比较的是所指向的内容是否相等
    
    
### String类替换方法
    replace(原来的字符串, 新替换的字符串);
    
    
### String中equals方法和==区别
    String类中equals方法是比较内容是否相同
    String类中==是比较字符串地址是否相同
    
    
> new出来的对象都是存放在堆内存当中的
>


### String类和StringBuilder
    String类和StringBuilder的区别是：String具有不可变性，StringBuilder不具备
    【注】：当频繁操作字符串的时候，可以使用StringBuilder类