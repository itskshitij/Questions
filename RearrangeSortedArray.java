package Questions.Array;

public class RearrangeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rearrangeArray(arr);
    }

    private static void rearrangeArray(int[] arr) {
        int min = 0;
        int max = arr.length-1;
        int[] temp = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            if (i % 2 != 0){
                temp[i]  = arr[min];
                min++;
            }else {
                temp[i] = arr[max];
                max--;
            }
        }
        for (int i :temp){
            System.out.print(i+" ");
        }

    }

}

