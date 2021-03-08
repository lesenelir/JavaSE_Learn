package java_Algorithm.Demo01_Array.Demo06_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();  // 有符合的数组加入lists集合中
        lists.add(new ArrayList<>(Arrays.asList(-1, -1, 2)));
        lists.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));
        lists.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));

        System.out.println("输出元素：");
        for (int i = 0; i < lists.size(); i++) {
            // get(index)方法是返回index下标的元素
            // 遍历返回数组
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }

    }
}
