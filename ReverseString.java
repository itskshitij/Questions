package Questions.Stringss;

public class ReverseString {
    public static void main(String[] args) {
        String name = "kshitij";
        rotateString(name);
    }

    private static void rotateString(String str) {
        String rev = "";
        for (int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
