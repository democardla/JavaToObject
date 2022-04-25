package com.familyTreeTest;

public class User {
    String id = null;
    User father = null;
    User mather = null;
    User[] sibling = null;//兄弟姐妹
    User couple = null;
    User[] children = null;

    int age;
    String name;
    String gender;
    String birthDate;
    boolean ifIll = false;


    public User() {
    }

    public User(int age, String name, String gender, String birthDate) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public User(User father, User mather, User[] sibling, User[] children, int age, String name, String gender, String birthDate, String id , User couple) {
        this.father = father;
        this.mather = mather;
        this.sibling = sibling;
        this.children = children;
        this.couple = couple;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public User getCouple() {
        return couple;
    }

    public User getFather() {
        return father;
    }

    public User getMather() {
        return mather;
    }

    public User[] getSibling() {
        return sibling;
    }

    public User getChildren(int index) {
        return children[index];
    }
    public User[] getChildren(){
        return children;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public void setFather(User father) {
        this.father = father;
    }

    public void setMather(User mather) {
        this.mather = mather;
    }

    public void setSibling(User[] sibling) {
        this.sibling = sibling;
    }

    public void setChildren(User[] children) {
        this.children = children;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCouple(User couple) {
        this.couple = couple;
    }
}
