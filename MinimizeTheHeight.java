package Questions.Array;

//Input:
//        K = 2, N = 4
//        Arr[] = {1, 5, 8, 10}
//        Output:
//        5
//        Explanation:
//        The array can be modified as
//        {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
//        The difference between
//        the largest and the smallest is 8-3 = 5.

public class MinimizeTheHeight {
    public static void main(String[] args) {

        int arr[] ={7,7,3,5};//{1, 5, 8, 10};
        int k = 1;
        int n = arr.length-1;
       // System.out.println(minimumHeight(arr, k, n));
        System.out.println(getMinDiff(arr,n,k));
    }

    private static int minimumHeight(int[] arr, int k, int n) {


        for (int i =0;i<arr.length;i++){
            if (arr[i]<k){
                arr[i] += k;
            }
            else
                arr[i] -= k;

        }
//        for (int i : arr){
//            System.out.println(i);
//        }
        int min = arr[0];
        int max = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max= arr[i];
            }
        }
//         System.out.println(min+" "+max);
        int diff = max - min;
//        System.out.println(diff);
        return diff;
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        // code here
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<k){
                arr[i] += k;
            }
            else{
                arr[i] -= k;
            }
        }
        int min = arr[0];
        int max = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int diff = max - min;
        return diff;
    }
}
