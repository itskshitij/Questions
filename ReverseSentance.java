package Questions.Stringss;

public class ReverseSentance {
    public static void main(String[] args) {
        String str = "My name is Kshitij";
        //output = Kshitij is name My
        reverse(str);
    }

    private static void reverse(String str) {
        String rev = "";
        String word = "";

        for (int i= str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if (ch != ' '){
                word = ch + word;
            }
            if (ch == ' '){
                rev += word+' ';
                word = "";
            }

        }
        rev = rev +word;
        System.out.println(rev);
    }
}
