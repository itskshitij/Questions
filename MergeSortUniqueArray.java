package Questions.Array;

import java.util.Set;
import java.util.TreeSet;

public class MergeSortUniqueArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,1,3};
        int[] arr1 = {2,3,4,5,6,7,8,9};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0;i< arr.length;i++){
            set.add(arr[i]);
        }
        for (int i = 0;i< arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println(set);

    }
}
