package com.test;

public class Girl {
    private String name;
    private int age;

    public Girl(String name,int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Marry(Boy boy){
        System.out.println("Be Married to " + boy.getName());
    }

    public void compare(Girl girl){

    }
}
