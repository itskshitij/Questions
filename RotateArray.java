package Questions.Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        while (d!= 0){
            int temp = arr[0];
            for (int i = 0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            d--;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
