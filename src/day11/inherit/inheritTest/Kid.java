package day11.inherit.inheritTest;

public class Kid extends Person{
    String major;

    public Kid() {
    }

    public Kid(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void study(){
        System.out.println("I'm no need to study");
    }

    @Override
    public void speaking(){//方法重写
        System.out.println("我不会说话");
    }

    //使用多态性之后无法直接调用该方法
    public void cry(){
        System.out.println("wwdk");
    }
}
