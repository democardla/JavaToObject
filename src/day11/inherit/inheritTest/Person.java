package day11.inherit.inheritTest;

public class Person {
    String name;
    int age = 50;
//    command+n :小窗中设置getter与setter
    public Person(){

    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void eating(){
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleeping");
    }
    public void speaking(){
        System.out.println("我说中文");
    }

}

