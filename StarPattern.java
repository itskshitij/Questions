package Questions.Pattern;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }

    private static void pattern(int n) {
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n;j++){
               if ((i+j)<=n){
                   System.out.print(" ");
               }
               else {
                   System.out.print("*");
               }
            }
            System.out.println();
        }

    }
}
