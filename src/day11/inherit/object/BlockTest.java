package day11.inherit.object;
/*
代码块：类似于swift中的闭包
作用： 1。初始化类与对象
      2。只能用static来修饰代码块
      3。静态代码块与非静态代码块
      4。
类型：
//非静态代码块：不用static修饰的
    >内部可以有输出语句
    >随着对象的实例化而执行
    >每创建一次对象就执行一次
    >
{   }
//静态代码块：用static修饰的
    >内部可以有输出语句
    >内容随着类的加载而执行
    >不可以调用非静态的属性
static {    }

 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person .description;
        Person person = new Person();
    }
}

class Person {
    String name;
    int age;
    static String description;
    public Person(){

    }

    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    //非静态代码块
    {
        this.age = 12;
        System.out.println("hi");//对象被创建时被执行
    }
    //静态代码块
    static {
        String signal = null;
        System.out.println("hello");//对象加载的时候被执行
    }
}