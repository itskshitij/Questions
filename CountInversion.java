package Questions.Array;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {   2,4,1,3,5};
        System.out.println(invsersionCount(arr));
    }

    private static int invsersionCount(int[] arr) {
        int count = 0;
        for (int i =0;i< arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
}
//    Given an array of integers. Find the Inversion Count in the array.
//        Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
//
//        Inversion Count: For an array, inversion count indicates how far (or close) the array
//        is from being sorted. If the array is already sorted then the inversion count is 0.
//        If an array is sorted in the reverse order then the inversion count is the maximum.
//
//        Examples:
//
//        Input: n = 5, arr[] = {2, 4, 1, 3, 5}
//        Output: 3
//        Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
