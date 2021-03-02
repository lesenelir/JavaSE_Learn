

> Demo01 与 Demo02 都是通过Thread类创建线程
>



### 为什么要实现Runnable接口，不单单使用继承Thread类来创建线程
    - 因为Java不支持多继承，如果myThread类以及继承了其他的类就不能继续继承Thread类来创建线程
    - 不打算重写Thread类的其他方法
    