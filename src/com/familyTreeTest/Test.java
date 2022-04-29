package com.familyTreeTest;

import java.security.PrivateKey;
import java.util.Vector;

import static com.familyTreeTest.controlMethod.getRelatedPerson;

public class Test {
    public static void main(String[] args) {
        int upperbound=0;
        int lowerbound=0;
        int total = upperbound+lowerbound;
        User startPoint = new Male();//后续需要改写:暂时定为男性方便下面的方法编写
        for (int i = 0;i<upperbound;i++){
            startPoint = startPoint.getFather();
        }

//        controlMethod controlMethod = new controlMethod();//报错了，因为我们将它设置为不可实例化
        Vector couple = getRelatedPerson(total,startPoint);
        for (int i = 0;i< couple.size();i++){
            if (couple.get(i) instanceof Male){
                //TODO: printItems(String uniqueMark,atRow(locationKey))//在具体某一行上输出结果:男生输出？女生输出？
            } else if (couple.get(i) instanceof Female){
                //TODO: printItems(String uniqueMark,atRow(locationKey))
            }
        }
    }
}
