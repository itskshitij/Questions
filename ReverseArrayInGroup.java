package Questions.Array;

public class ReverseArrayInGroup {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        rotateArr(arr, k);
    }

    private static void rotateArr(int[] arr, int k) {
        int n = arr.length-1;
        int i = 0;
        k--;
        while (k!=0){
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
            i++;
            k--;
        }
        i++;
        while (i != n){
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
            i++;
        }
        for (int x : arr){
            System.out.print(x+" ");
        }
    }

}
//
//    Given an array arr of positive integers. Reverse every sub-array group of size k.
//
//        Note: If at any instance, k is greater or equal to the array size,
//        then reverse the entire array. You shouldn't return any array, modify the given array in place.
//
//        Examples:
//
//        Input: k = 3, arr= [1, 2, 3, 4, 5]
//        Output: [3, 2, 1, 5, 4]
//        Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5