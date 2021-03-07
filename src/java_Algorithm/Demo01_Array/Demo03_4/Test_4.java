package java_Algorithm.Demo01_Array.Demo03_4;

public class Test_4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] all = new int[size];
        int i = 0, j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {  // 循环谁最小就取谁
            if (nums1[i] <= nums2[j])
                all[index++] = nums1[i++];
            else
                all[index++] = nums2[j++];
        }
        while (i < nums1.length) {
            all[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            all[index++] = nums2[j++];
        }
        double res = 0.0;
        if (size % 2 == 0) {
            res = (all[all.length / 2] + all[all.length / 2 - 1]) * 1.0 / 2;
        } else {
            res = all[all.length / 2] * 1.0;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2};
        double result = findMedianSortedArrays(num1, num2);
        System.out.println(result);
    }
}
