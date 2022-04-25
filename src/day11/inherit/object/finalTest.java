package day11.inherit.object;

/**
 * comment: final可以修饰类，方法，变量(相当于将变量变成常量，常量一般全字母大写，如：NUM）
 * comments of {@link FinalClassA}:
 *
 * 这是最后的一个类，他无法被继承
 *
 */
final class FinalClassA{
    /**
     * 此时final声明的方法不可以被重写
     */
    public final void func1(){

    }
    /**
     * final修饰的变量看作常量，其数值不可以再次更改<br>
     *
     * 赋值：<br>
     * 1。显式初始化<br>
     * 2。代码块中初始化<br>
     * 3。构造器中初始化<br>
     */
    final int anInt = 10;//显式初始化
    final int anotherInt;
    {
        anotherInt = 12;//代码块中初始化
    }
    //构造器中初始化
    final int theOtherInt;
    public FinalClassA(){
        theOtherInt = 13;
    }
    public FinalClassA(int anInt){
        theOtherInt = anInt;
    }
}