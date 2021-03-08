package java_Algorithm.Demo01_Array.Demo06_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test_15 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();  // 有符合的数组加入lists集合中

        Arrays.sort(nums);

        if (nums.length < 3) lists = null;

        // 排序后 左右夹逼
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
//            if (i > 0 && nums[i] == nums[i-1]) continue;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0) {  // 大
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    List<Integer> integerList = new ArrayList<>();
                    integerList.add(nums[i]);
                    integerList.add(nums[j]);
                    integerList.add(nums[k]);
                    lists.add(integerList);
                    // 去重复
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
/*
                    // 去重复第二种方法：
                    for (int l = 0; l < lists.size(); l++) {  // 遍历lists数组比对lists存放的数组的大小是否相等
//                        Arrays.toString(lists.get(i).toArray())
                        for (int m = l; m < lists.size(); m++) {
                            if (lists.get(l).equals(lists.get(m))) {
                                lists.remove(j);
                            }
                        }
                    }

 */
                    // 一次while循环结束下标
                    j++;
                    k--;
                }
            }

        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listList = new ArrayList<>();
        listList = threeSum(nums);
        System.out.println(listList);
    }
}
