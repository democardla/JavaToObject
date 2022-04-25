package day11.inherit.object;
/**
 * abstract的使用：<br>
 * >修饰类：使类变为抽象类<br>
 * >修饰方法：使方法成为抽象方法<br>
 *
 * abstract 不可以修饰构造器，final类
 * abstract 不可以修饰私有方法，静态方法，final的方法
 */
public class AbstractTest {
    public static void main(String[] args) {
//        Person person = new person();//因为不可实例化而报错
        /**
         * 匿名子类:创建匿名类的一个匿名子类的对象person
         * 使用匿名类的标识符创建匿名子类
         */
        person person = new person() {
            @Override
            public void func() {
                System.out.println("hh");
            }
        };//分号不要忘记
    }
}

/**
 * comments of {@link person}:<br>
 * >被abstract修饰的类不可以被实例化<br>
 * >子类会使用父类的构造器<br>
 * >在开发中我们会提供子类来实现抽象父类的方法<br>
 * >包含抽象方法的类一定是抽象类<br>
 */
abstract class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }//构造器不代表没有用了，因为它的子类会使用

    public person() {
    }

    public abstract void func();//声明抽象方法
    public void eating(){
        System.out.println("eating");
    }
    public void walk(){
        System.out.println("walking");
    }
}
class student extends person {
    //子类在继承抽象类之后，父类的所有抽象方法，如：func()必须重写；或者将子类，如：student声明为abstract
    @Override
    public void func() {

    }
}



