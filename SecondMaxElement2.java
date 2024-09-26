package Questions.Array;

public class SecondMaxElement2 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,2,8,7,4,34,23};
        System.out.println(secondMax(arr));
    }

    private static int secondMax(int[] arr) {
        int max = arr[0];
        int secondmax = arr[1];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<max && arr[i]>secondmax){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
}
