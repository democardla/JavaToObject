package com.object;

/*构造器(构造方法)的使用(constructor)
    //1。作用：1>创造对象
              2>初始化对象信息
    //2。说明：1>如果没有明确定义类的构造器，则会默认给定一个空参数构造器
              2>定义构造器格式：权限修饰符 类名(形参列表){}
              3>一个类中的构造器可以重载
              4>默认的构造器的权限修饰符与其所在的类的权限修饰符一致
*/
public class personTest {
    public static void main(String[] args) {
        person person = new person(12,"John",true);//person()被称作构造器
        String gender = null;
        if (person.isMale()){
            gender = "boy";
        } else {
            gender = "girl";
        }
        System.out.println(person.getName() + " is a " + person.getAge() +" years old "+ gender);
    }
}



class person{
    //参数
    private String name;
    private int age;
    private boolean isMale;

    //构造器
        //public constructor
    public person(String name){
        this.name = name;
    }

    public person(int age,String name){
        this(name);//注意直接this(重复的参数名称列表)即可
        this.age = age ;
    }

    public person(int age,String name,boolean isMale){
        this(age,name);
        this.isMale = isMale;
    }

    //功能
    public void setName(String name) {
        this.name = name;
    }//this 的使用

    public void setAge(int age) {
        this.age = age;//类的age等于函数抓取到的age,相当于swift的self.age = age
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }
}

/*
1。this可以修饰：属性，方法，构造器
2。this修饰属性与方法时，this理解为：当前对象，即this.age = age 意思是类属性的值被赋予得到的属性
3。this修饰构造器时，this可以精简代码：
    >this(***)必修声明在构造器的首行
    >只能调用一个非本身构造器，即声明一次this(***)
 */