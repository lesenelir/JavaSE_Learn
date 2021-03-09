package java_Algorithm.Demo01_Array.Demo08_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1, l = nums.length - 1;
                int sum = target - nums[i] - nums[j];

                while (k < l) {
                    if (nums[k] + nums[l] > sum) {
                        l--;
                    } else if (nums[k] + nums[l] < sum) {
                        k++;
                    } else {
                        List<Integer> integerList = new ArrayList<>();
                        integerList.add(nums[i]);
                        integerList.add(nums[j]);
                        integerList.add(nums[k]);
                        integerList.add(nums[l]);
                        lists.add(integerList);
                        // 去重复
                        while (k < l && nums[k] == nums[k + 1]) k++;
                        while (k < l && nums[l] == nums[l - 1]) l--;
                        k++;
                        l--;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,0,-1,0,-2,2};
        List<List<Integer>> lists = fourSum(nums, 0);
        System.out.println(lists);
    }
}
