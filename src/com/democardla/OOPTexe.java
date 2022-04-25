package com.democardla;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class OOPTexe {
    /**
     * >1。Java类及类的成员：属性，方法，构造器，代码块，内部类。<BR/>
     * >2。面向对象的特征：封装，继承，多态，（抽象）//要搞清楚代码，就懂了<BR/>
     * >3。关键字：
     */

    public static void main(String[] args) {
        //创建了多个对象，并使每一个对象的属性独立(non-static)
        PresonTest person1 = new PresonTest();
        System.out.println(person1.age);
        System.out.println(person1.isMale);

        PresonTest person2 = new PresonTest();
        person2.isMale = true;
        person2.age = 12;
        person2.name = "henry";
        System.out.println(person2.isMale);

        //匿名对象：它只能调用一次
        new PresonTest().eat();//没有声明变量来接收它的值
            //匿名变量的使用
        personMall mall = new personMall();
        mall.show(new PresonTest());

    }
}

//匿名变量的使用
class personMall{
    public void show(PresonTest person){
        person.eat();
    }
}