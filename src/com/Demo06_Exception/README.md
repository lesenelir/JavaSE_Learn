### throw 与 throws 区别：



# 
### throw
    语法：throw 异常对象/throw new 异常类型(参数列表)
    throw抛出的异常可以在方法体内，自行通过try...catch...finally进行处理，也可以通过throws通知方法调用者，应用时再进行处理
   
   
# 
### throws
    语法：throws异常类型列表
    表现一种产生异常的可能性，但不一定会发生
    表示通知方法调用者，使用该方法时，可能会发生哪些异常，需要进行相关处理
    