package Questions.Array;

public class SecondMaxElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,2,8,7,4,34,23};
        System.out.println(secondMax(arr));
    }

    private static int secondMax(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        return arr[arr.length-2];
    }
}
