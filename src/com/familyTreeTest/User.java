package com.familyTreeTest;

import java.util.Vector;

abstract class User {
    static int IDfactory = -1;
    private int IDGenerator(){
        return ++IDfactory;
    }
    private int id = IDGenerator();
    boolean ifIll = false;
    int ageOfOnset;//发病年龄

    User father = null;
    User mather = null;
    Vector sibling = new Vector();//兄弟姐妹
    User couple = null;
    Vector children = new Vector();

    public User() {
    }

    public User(int ageOfOnset, boolean ifIll, User father, User mather, Vector sibling, User couple, Vector children) {
        this.ageOfOnset = ageOfOnset;
        this.ifIll = ifIll;
        this.father = father;
        this.mather = mather;
        this.sibling = sibling;
        this.couple = couple;
        this.children = children;
    }//在读取文件的时候创建相关的对象使用

    public int getId() {
        return id;//获取ID
    }

    public boolean isIfIll() {
        return ifIll;
    }

    public int getAgeOfOnset() {
        return ageOfOnset;
    }

    public User getFather() {
        return father;
    }

    public User getMather() {
        return mather;
    }

    public Vector getSibling() {
        return sibling;
    }

    public User getCouple() {
        return couple;
    }

    public Vector getChildren() {
        return children;
    }
    public User getChild(int index){
        if(!children.isEmpty()) {
            if (children.get(index) instanceof Female)
            return (Female)children.get(index);
        } else {
            return (Male)children.get(index);
        }
        return null;
    }
}
