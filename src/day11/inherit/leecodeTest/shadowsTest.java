package day11.inherit.leecodeTest;


import org.junit.Test;

public class shadowsTest {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};
        myIntArray[0] = 1;
        myIntArray[2] = 1;
        int[][] myIntArr = {{1,2},{1,2}};
        System.out.println(myIntArr.length);
        int a = shadows.lengthTest(myIntArray);

        System.out.println(a);
    }
}
class shadows{
//    private shadows(){
//
//    }
    static int[] IntArray = new int[50];//
    static public int lengthTest(int[] input ){
        int[] myIntArray = input;
        int countOfArray = myIntArray.length;
        return countOfArray;
    }
}


//class Solution {
//    @Test
//    public int projectionArea(int[][] grid) {
//
//        return sumOfArea;
//    }
//}