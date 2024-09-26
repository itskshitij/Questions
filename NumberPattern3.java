package Questions.Pattern;

public class NumberPattern3 {
    public static void main(String[] args) {
        int n = 3;
        int x = 5;

        for (int i =1;i<=n;i++){

            for (int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j= 1;j<=i;j++){
                System.out.print(x+" ");
                //x *=x;
            }
            x = x*x;
            System.out.println();
        }

        int y = 25;
        for (int i =n-1;i>=1;i--){

            for (int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j= 1;j<=i;j++){
                System.out.print(y+" ");
                //x *=x;
            }
            y /=5;
            System.out.println();
        }
    }
}
