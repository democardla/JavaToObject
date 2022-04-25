package com.test;

public class studentsTest {
    public static void main(String[] args) {
        student[] students = new student[20];
        for (int i = 0;i<20;i++){
            student student = new student();
            student.number = i+1;
            student.score =(int) (Math.random()*100 + 1);
            student.state =(int) (Math.random()*3 + 1);
            students[i] = student;
        }


        for (int i = 0;i<20;i++){
            if (students[i].state == 3){
                System.out.println((students[i].number + "号同学获得" + students[i].score + "分"));
            }
        }

        for (int i = 0;i<students.length;i++){
            for (int j = 0;j<students.length-i-1;j++){
                if (students[j].score<students[j+1].score){
                    student aStudent = null;
                    aStudent = students[j];
                    students[j] = students[j+1];
                    students[j+1] = aStudent;
                }
            }
        }

        System.out.println();
        for (int i =0;i<students.length;i++){
            System.out.println((students[i].number + "号同学获得" + students[i].score + "分"));
        }
    }
}
