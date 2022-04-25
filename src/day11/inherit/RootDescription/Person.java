package day11.inherit.RootDescription;



public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void eat(){
        System.out.println("eating");
    }
    public void walk(){
        System.out.println("walking");
    }

    @Override
    public boolean equals(Object o) {//重写equals方法
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;//为了防止o的属性无法使用的情况
        return age == person.age && name.equals(person.name);
    }

    @Override
    //重写输出方法
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
