package Questions.Stringss;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        String str = "My Name Is Kshitij";
        // output = mY nAME iS kSHITIJ;
        upperToLower(str);
    }

    private static void upperToLower(String str) {
       String newStr = "";
       for (int i = 0;i<str.length();i++){
           char ch = str.charAt(i);
           if (ch<= 90 && ch>=65){
               newStr += Character.toLowerCase(ch);
           }
           else{
               newStr += Character.toUpperCase(ch);
           }
       }
        System.out.println(newStr);
    }
}
