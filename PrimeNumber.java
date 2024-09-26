package Questions.Array;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(prime(n));
    }
    private static boolean prime(int n) {
        if (n % 2 == 0){
            return false;
        }

        for (int i = 3;i<n;i= i+2){
            if (n% i == 0){
                return false;
            }
        }

        return true;
    }
}
