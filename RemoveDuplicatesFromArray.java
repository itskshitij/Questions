package Questions.Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,3,4,5,6,7,4,4,8};
        removeDuplicates(arr, arr.length);
    }

    private static void removeDuplicates(int[] arr, int length) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<length;i++){
            int num = arr[i];
            if (num == -1){
                continue;
            }
            for (int j = 0;j< arr.length;j++){
                if (num == arr[j]){
                    arr[j] = -1;
                }
            }
            list.add(num);
        }
        System.out.println(list);
    }
}
