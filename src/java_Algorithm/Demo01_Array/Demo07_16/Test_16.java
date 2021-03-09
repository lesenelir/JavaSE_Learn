package java_Algorithm.Demo01_Array.Demo07_16;

import java.util.Arrays;

public class Test_16 {
    public static int threeSumClosest(int[] nums, int target) {
        // 先排序，再采取从数组前后两侧夹逼逼近

        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int threeNum = nums[i] + nums[j] + nums[k];
                if (Math.abs(threeNum - target) < Math.abs(closestNum - target)) {
                    closestNum = threeNum;
                }
                if (threeNum > target) {  // 三个数字和大于目标值，最大值前移
                    k--;
                } else if (threeNum < target) {
                    j++;
                } else {
                    return target;
                }
            }

        }
        return closestNum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 2, 1, -4};
        int res = threeSumClosest(nums, 2);
        System.out.println(res);
    }
}
