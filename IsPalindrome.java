package Questions.Stringss;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw?";
        System.out.println(palindromeCheck(str));
    }

    private static boolean palindromeCheck(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z]","");

        //System.out.println(str);

        int n = 0;
        int j = str.length()-1;
        while (n != 0){
            if (str.charAt(n) != str.charAt(j)){
                return false;
            }
            n++;
            j--;
        }
        return true;
    }
}
