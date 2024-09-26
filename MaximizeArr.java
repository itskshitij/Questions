package Questions.Array;
//
//Input : arr[] = [5, 3, 2, 4, 1]
//        Output : 40
//        Explanation: If we arrange the array as 1 2 3 4 5 then we can see that the minimum index
//        will multiply with minimum number and maximum index will multiply with maximum number.
//        So, 1*0 + 2*1 + 3*2 + 4*3 + 5*4 = 0+2+6+12+20 = 40 mod(109+7) = 40

import java.util.Arrays;

public class MaximizeArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3};//{5,3,2,4,1};
        System.out.println(maxMultiple(arr));
    }

    private static int maxMultiple(int[] arr) {
        int mult = 0;
        Arrays.sort(arr);
        for (int i =0;i< arr.length;i++){
            int m = arr[i]*i;
            mult += m;
        }
        return mult;
    }
}
