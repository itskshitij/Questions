package Questions.Pattern;

import java.util.Arrays;

public class ArrayPattern {
    public static void main(String[] args) {
        int[] ar = {9,2,4,0,6,1};
        int max = arr(ar);
       //System.out.println(max);
        for (int i =max;i>0;i--){
          for (int j =0;j<ar.length;j++){

              if (ar[j]>=i){
                  System.out.print("* ");
              }else {
                  System.out.print("  ");
              }

             // System.out.print("* ");
          }

            System.out.println();
        }
    }

    private static int arr(int[] ar) {
        int max = ar[0];
        for (int i = 0;i<ar.length;i++){
            if (max<ar[i]){
                max = ar[i];
            }
        }
        return max;
    }
}
