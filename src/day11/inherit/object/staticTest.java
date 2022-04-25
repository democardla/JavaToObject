package day11.inherit.object;
//static 修饰的对象不归具体某一对象所有，而是可以公用的
/*
1。修饰属性：静态属性是可以通过类名来调用的 -> line 14
2。修饰方法:静态方法是可以通过类名调用的 -> line 15
3。代码块，内部类

如何确定一个属性或者方法需要static声明：
1。什么样的属性需要声明static：
    >当您认为所有的对象都需要同一个属性时，需要声明static
    >类中的常量常常被声明为static

2。什么样的方法需要声明static：
    >操作静态属性的方法需要声明static；
    >工具类的方法习惯声明为静态方法:工具类是可以不用实例化就可以使用方法的类


注意：在静态的方法中，不可使用this，super关键字；静态方法只能调用静态属性，非静态方法可以调用任何属性

 */




public class staticTest {
    public static void main(String[] args) {
        Chinese chinese1 = new Chinese();
        chinese1.country = "China";//修改时不提示
        Chinese chinese2 = new Chinese();
        System.out.println(chinese2.country);
        Chinese.country="null";//-> line 4
        Chinese.outputNation();//-> line 5
    }
}
class Chinese{
    static String country;//修改过的静态值在使用时，多个不同对象的呈现的值是一样的
    String name;
    int age;
    public static void outputNation(){
        System.out.println(country);
    }
}



/**
 * 单例设计模式：<br>
 *
 */
//饿汉式：线程安全的
class England{
    //1.在类中声明私有的构造器，用来避免类被持续的实例化
    private England(){
    }
    //2.在类的内部创建类的对象
    private static England england = new England();
    //3.提供公共方法返回类的静态对象
    public static England getEngland(){
        return england;
    }
}
//懒汉式：好处：可以节省内存，仅在使用时调用；缺陷：目前写法是线程不安全的
class America{
    private America(){

    }
    //先不创建对象
    private static America america = null;
    //在使用时创建对象
    public static America getInstance() {
        if (america == null)
            america = new America();
        return america;
    }
}