package com.test;

public class Boy {
    private String name;
    private int age;

    public Boy(String name,int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
         this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
    public void Marry(Girl girl){
        System.out.println("Marries " + girl.getName());
    }

    public void shout(){
        if (this.age<22){
            System.out.println("You can marry!");
        }else{
            System.out.println("wite");
        }
    }

}
