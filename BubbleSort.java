package Questions.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,6,7,2,7,5,3,4};
        bubbleSort(arr);
    }
    private static void bubbleSort(int[] arr) {

        for (int i = 0; i<arr.length;i++){
            for (int j = 0;j< arr.length-i-1;j++){
                if (arr[j+1] < arr[j]){
                    int  temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
