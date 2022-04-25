package com.democardla;

public class UserTest {
    //类中属性的使用
    //成员变量：可以使用权限修饰符
    //局部变量：声明在方法内、方法形参、代码块、构造器形参、构造器内部的变量。-->没有初始化值，调用时要先赋值
    public static void main(String[] args) {
        User user1 = new User();
        reversePosition reversePosition = new reversePosition();
        reversePosition.usable = 1;

    }

}

class User{
    /**language是局部变量*/
    public void speak(String language){ }//无返回值
    public String feedBack(){
        String feedBack = "hello";
        return feedBack;
    }//有返回值
}

//权限修饰符：private\缺省\protected\public（由小到大排列）
    //修饰类的修饰符只能使用public或缺省

class reversePosition {
    private int tmp;//private修饰的变量：不会在使用该类时显示在代码提示中
    int usable;//可以显示
}

//方法中不可以定义另外一个方法