package day11.inherit.包装类;
//包装类：wrapper使用
//基本数据类型与包装类之间是意义对应的关系
//单元测试方法：JUnit

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

public class test {
    @Test
    //初次在工程中应用JUnit时，我们可以先在创建的Java类文档中输入@Test，等待其报错，然后在查看详情的时候点击添加JUint即可。

    /*Java类的要求：
    1。类是public的
    2。此类提供公共空参的构造器
    3。单元测试方法方法权限是public，没有返回值与形参
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector myArr = new Vector();//用于创建可以随意加减元素的数组
        int score = scanner.nextInt();
//        System.out.println(score);
        if (score>0) {
            myArr.add(score);
        } else {
            Object MaxNumber = myArr.get(0);
            for (int i = 1;i<myArr.size();i++){
                int j = ((Integer) myArr.get(i)).intValue();
                int x = ((Integer) MaxNumber).intValue();
                if (j>x){
                    MaxNumber = myArr.get(i);
                }
            }
        }
    }
}
