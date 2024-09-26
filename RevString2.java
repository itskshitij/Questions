package Questions.Stringss;

public class RevString2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("kshitij");
        rotateString1(str);
    }

    private static void rotateString1(StringBuilder str) {
        int i = 0;
        int j = str.length()-1;
        while (i<j){
           char temp = str.charAt(i);
           str.setCharAt(i, str.charAt(j));
           str.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(str);
    }
}
