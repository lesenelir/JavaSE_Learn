package java_Algorithm.Demo01_Array.Demo05_1;

import java.util.HashMap;
import java.util.Map;

public class Test_1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] all = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);  // map存储补数
            if (map.containsKey(nums[i])) {
                all[0] = i;
                all[1] = map.get(nums[i]);
                break;
            }
        }
        return all;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        int[] all = twoSum(nums, 6);
        for (int n: all) {
            System.out.print(n + " ");
        }
    }
}
