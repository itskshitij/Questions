package Questions.Array;
import java.util.ArrayList;
import java.util.List;
public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        int n = arr.length;
        frequencyArray(arr, n);
    }

    private static void frequencyArray(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<arr.length;i++){
            int count = 0;
            int num = arr[i];
            if (num == -1){
                continue;
            }
            for (int j = 0;j<arr.length;j++){

                if (num == -1){
                    continue;
                }
                if (arr[j] == num){
                    count++;
                    arr[i] = -1;
                }
            }
            list.add(count);
        }
        System.out.println(list);
    }

}
//
//Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
//        Output: [0, 2, 2, 0, 1]
//        Explanation: Counting frequencies of each array element We have: 1 occurring 0 times.
//        2 occurring 2 times.
//        3 occurring 2 times.
//        4 occurring 0 times. 5 occurring 1 time, all the modifications done in the same given arr[].