package Questions.Array;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sortArray(arr);
       // float x = 35/0;

    }

    private static void sortArray(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
