package java_Algorithm;

import java.util.*;

public class BasicKnowledge {
    public static void main(String[] args) {
        // 1. Array  静态数组
        int[] a = new int[8];
        int[] b = new int[]{0, 0, 1, 1, 2};

        // 2.动态数组
        List<Integer> arrayList = new ArrayList<>();  // 数组
        List<Integer> linkedList = new LinkedList<>();   // 链表

        // 3.栈
        Stack<Integer> stack = new Stack<>();

        // 4.队列
        Queue<Integer> queue = new LinkedList<>();

        // 5.集合 ---- 没有重复元素
        Set<Integer> set = new HashSet<>();

        // 6.散列表
        HashMap<Integer, String> hashMap = new HashMap<>();

    }
}
