package day11.inherit.RootDescription;

//super:类似于this，super.XXX或super.XXX()调用父类的某个值或函数
//super() 调用构造器
//应用于：子类重写了父类的方法或属性，子类又想调用父类的方法的值或属性。
public class student extends Person {
    String major;

    public student(String name, int age, String major) {
        super(name, age);//调用构造器：首行
        this.major = major;
    }

    public student(String major) {
        this.major = major;
    }
    public student(){

    }
    public void eat(){

        System.out.println("eating");
    }
    public void cry(){
        System.out.println("qsxy");
    }
}
