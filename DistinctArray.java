package Questions.Array;

public class DistinctArray {
    public static void main(String[] args) {
        int[] num = {1,2,1,2,4,2,4,3,5,3,6};
        distinctarray(num, num.length);
    }

    private static void distinctarray(int[] arr, int length) {
        for (int i = 0;i<length;i++){
            int count = 0;
            int num = arr[i];
            if(num == -1){
                continue;
            }
            for (int j = 0;j<length;j++){
                if (arr[j] == num){
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println(num+" : "+count);
        }
    }
}
