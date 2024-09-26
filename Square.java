package Questions.Pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Entet the no of rows");
       // int n = sc.nextInt();
        int[] arr = {2,5,7,2,89,6,9};
        int m = arr.length;
        System.out.println(m);
        for (int i =0;i<m;i++){
            for (int j = 0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
