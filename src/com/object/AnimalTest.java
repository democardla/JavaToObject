package com.object;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setLegs(-2);
        System.out.println(animal.getLegs());

    }
}

//封装性案例
class Animal{
    //隐藏类属性：私有化属性
    private int legs;//无法通过调用设置

    //设置类属性的方法
    public void setLegs(int i){
        if (i<=0){
//            legs = 0;
            throw new RuntimeException("it is illegal");//抛出异常
        } else {
            legs = i;
        }
    }

    //读取类属性的方法
    public int getLegs(){
        return legs;
    }
}