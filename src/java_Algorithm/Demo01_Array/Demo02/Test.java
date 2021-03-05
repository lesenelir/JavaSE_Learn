package java_Algorithm.Demo01_Array.Demo02;

public class Test {
    // 80. 删除排序数组中的重复项 II

    public static int removeDuplicate(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {  // 从第三个数组元素开始循环
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 1, 1, 2, 3, 3};
        int res = removeDuplicate(nums);
        System.out.println(res);
    }
}
