package day11.inherit.object;


import day11.inherit.RootDescription.Person;



//我们可以System.gc()或者RunTime.getRuntime().gc()来通知垃圾回收，垃圾回收之前会调用finalize()
public class objectTest {
//1。==：用于同种基本数据的等价性比对，验证引用数据类型的地址值是否相等
//2。equals():只用于引用数据类型，验证引用数据的地址值是不是一致：String，Date，File，包装类等除外，因为他们对equals()进行了重写

    public static void main(String[] args) {
        Person person = new Person("ali",12);
        System.out.println(person);//因为经过了toString()方法的重写，所以输出发生了改变Person{name='ali'}
    }
}
