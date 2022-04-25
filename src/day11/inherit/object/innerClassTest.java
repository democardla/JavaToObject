package day11.inherit.object;
/*
 * 内部类：Java允许将类A声明在类B中
 * 1。分类：
 *  1。1：成员内部类(静态&非静态）
 *  1。2：局部内部类（方法内、代码块、构造器中）
 * 内部类：麻雀虽小，五脏俱全
 */
public class innerClassTest {

    public static void main(String[] args) {
        //静态成员内部类实例化
        innerClass.AA aa = new innerClass.AA();
        //非静态成员内部类实例化
        innerClass innerClass = new innerClass();
        innerClass.CC cc = innerClass.new CC();
    }
}

class innerClass{
    int anInt;
    //成员内部类
    static class AA{

    }

    class CC{

    }

    //局部内部类
    {
        class BB{
            public BB(int anInt) {
                innerClass.this.anInt = anInt;//内部类调用上级属性,PS.不可以使用super
            }
        }
    }

//内部类使用的常用方式
    public Comparable method1() {
        //标准方式
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
//        return new MyComparable();
        //匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}