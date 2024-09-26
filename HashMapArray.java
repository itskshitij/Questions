package Questions.Array;

import java.util.HashMap;
import java.util.Map;

public class HashMapArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,3,4,5,6,7,4,4,8};
        duplicates(arr, arr.length);
    }

    private static void duplicates(int[] arr, int length) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<length;i++){
            int count = 0;
            int num = arr[i];
            if(num == -1){
                continue;
            }
            for (int j = 0;j<length;j++){
                if (num == arr[j]){
                    count++;
                    arr[j] = -1;
                }
            }
            map.put(num,count);
        }
        System.out.println(map);
    }
}
