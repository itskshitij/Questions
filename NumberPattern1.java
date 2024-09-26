package Questions.Pattern;

public class NumberPattern1 {
    public static void main(String[] args) {
        int n = 4;
        int x =1;
        for (int i = n;i>0;i--){
            for (int j = 1;j<i;j++){
                System.out.print("  ");
            }
            for (int j = 0;j<=n-i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
