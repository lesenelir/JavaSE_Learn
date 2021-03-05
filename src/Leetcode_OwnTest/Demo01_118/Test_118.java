package Leetcode_OwnTest.Demo01_118;

import java.util.ArrayList;
import java.util.List;

public class Test_118 {


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        int[][] array = new int[numRows][numRows];
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();   //subList是一维数组
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) array[i][j] = 1;
                else {
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
                subList.add(array[i][j]);
            }
            lists.add(subList);
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists = generate(5);
        System.out.println(lists);
    }
}
