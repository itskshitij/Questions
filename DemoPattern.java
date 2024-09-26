package Questions.Pattern;

public class DemoPattern {
    public static void main(String[] args) {
        int[] arr = {9,2,4,0,6,1};
        int max = maxElement(arr);
       // System.out.println(max);

        for (int i = max;i>0;i--){
          for (int j =0;j<arr.length;j++){

                if (arr[j]>=i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
