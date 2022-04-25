package com.democardla;

public class overload {
    public static void main(String[] args) {
        functions functions = new functions();
        int[] myInts = new int[]{0,1,2,3,4};
        int outcomes = functions.add(myInts);
        System.out.println(outcomes);
    }


}


class functions {
    //方法的重载
    //在同一个类中可以存在多个重名的方法，但要求这些方法的参数列表：参数类型或者参数个数、顺序不同
    public int add(int a,int b){
        int ret = a + b;
        return ret;
    }
    public int add(int a, int b,int c){
        int ret = a+b+c;
        return ret;
    }

    //可变个数的形参：必须声明在末尾，即如果可变形参和其他单个形参在一起声明时，可变形参必须放在最后声明
    //格式
    public int add(int ... a){//int ... a 相当于 int[] a
        //...代表不确定的个数（可以是0个）,此时a相当于一个数组
        int ret = 0;
        for (int i = 0;i<a.length;i++){
            ret += a[i];
        }
        return ret;
    }

}