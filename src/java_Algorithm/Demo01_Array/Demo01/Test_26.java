package java_Algorithm.Demo01_Array.Demo01;

public class Test_26 {
    // 26. 删除排序数组中的重复项

    // 从数组的下标开始往后比对

    public static int removeDuplicate(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = removeDuplicate(nums);
        System.out.println(res);

    }
}
