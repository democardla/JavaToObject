package day11.inherit.object;



/**
 * 接口用来实现对象的多继承
 *
 * 一般用来封装抽象的功能
 *
 * 1。接口的使用：interface来定义
 * 2。Java中接口与类是两个并列的结构
 * 3。如何定义接口：定义接口中的成员
 *      3。1：jdk7以前：只能定义全局常量和抽象方法
 *          >全局常量：public static final作为前缀可以省略
 *          >抽象方法：public abstract作为前缀可以省略 foo()
 *      3。2：jdk8之后：还可以定义静态方法，默认方法（略）
 * 4。接口不含构造器：接口不可实例化
 * 5。让类实现接口功能：implements关键字,多个接口可以用","隔开
 *      >如果实现类实现了接口中的所有抽象方法，则该实现类可以实例化：言外之意是在创建对象之前要完成接口中所有抽象方法的重写
 *      >如果实现类未实现接口中的所有抽象方法，则该实现类仍为一个抽象类，该抽象类创建的对象也需要在上述两种解决方法中选择一个
 * 6。Java类可以实现多个接口 --->弥补了单继承性
 * 7。接口与接口之间可以继承，也可以多继承
 */
public class AboutInterface {
    public static void main(String[] args) {
        interfaceCarrier interfaceCarrier = new interfaceCarrier();//创建载体对象
        TestOfInterFace testOfInterFace = new TestOfInterFace();//创建符合该接口的对象
        interfaceCarrier.func1(testOfInterFace);//置入形参可以编译
        Class cal = testOfInterFace.getClass();//class 关键字的包装类
        //通过接口声明对象，匿名对象，我们没有给定这个对象叫什么，因此只能用一次
        flyable flyable1 = new flyable() {
            @Override
            public void foo() {
                System.out.println("憨憨");
            }

            @Override
            public void foo2() {
                System.out.println("sb");
            }
        };
        //声明了一个有名字的对象他可以被引用标识符调用
        flyable flyable2 = new TestOfInterFace();

    }
}

class interfaceCarrier{
    public void func1(flyable flyable){//接口可以用做声明形参，创建符合该接口的对象置入形参可以编译
        flyable.foo();

    }
}

class TestOfInterFace implements flyable{
    @Override
    public void foo() {
        System.out.println("override functions");
        //重写方法
    }

    @Override
    public void foo2() {
        //override all functions
    }
}//如果实现类实现了接口中的所有抽象方法，则该实现类可以实例化：言外之意是在创建对象之前要完成接口中所有抽象方法的重写

abstract class Test2 implements flyable{
    @Override
    public void foo() {

    }
}//如果实现类未实现接口中的所有抽象方法，则该实现类仍为一个抽象类,该抽象类创建的对象也需要在上述两种解决方法中选择一个

interface flyable {
    //全局常量:public static final可以省略
    public static final int MAX_SPEED = 7900;
    //抽象方法:public abstract可以省略
    void foo();
    void foo2();

}

//接口可以互相继承，也可以多继承
interface AA{

}
interface BB{

}
interface CC extends AA,BB{

}