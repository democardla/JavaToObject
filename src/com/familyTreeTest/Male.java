package com.familyTreeTest;

public class Male extends User{
    int From = 0;//当从上至下查找到他时，如果来源是父亲，则计为1，如果是母亲计为-1，初始化值是0
    boolean isPrecursor = false;//是否是先现者
    private int generation;

}
