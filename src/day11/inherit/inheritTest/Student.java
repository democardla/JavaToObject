package day11.inherit.inheritTest;


/*
继承性的好处：
1。减少了代码的冗余
2。便于功能的扩展
3。为之后的多态性的使用提供了前提

继承性的格式：class A extends B
A 子类、派生类、subclass
B 父类、超类、基类、superclass

继承性的原则：
1。一个子类只能有一个父类（类的单继承性）
2。一个类可以被多个子类继承
3。子父类是相对的概念
 */


/*
方法的重写：对父类的方法进行覆盖，但是不会影响到父类自己的属性
规则：
    1。重写方法与被重写方法的方法名和形参列表要一致
    2。重写方法的权限修饰符的等级不能小于被重写方法的权限修饰符
        >子类不能重写父类中private的方法
    3。重写的方法：父类的返回值是void，返回值类型只能是void；父类返回值为"A"类，那么子类的返回值可以是"A"类的子类
    4。基础类型的返回值重写后只能是原类型
    5。异常：throws出的类型不大于父类被重写的方法异常类型：。。。
    6。子类父类的同名同参数的方法需要同时声明成：static（非重写）或重写的
 */

public class Student extends Person {//属性的继承:使用extend继承
    String major;
    public Student(){

    }

    public Student(int age, String major, String name){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void study(){
        System.out.println("studying");
    }

    @Override
    public void speaking(){//方法重写
        System.out.println("我说英文");
    }


}
