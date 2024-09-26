package Questions.Stringss;

public class CountParticularElemeentsInString {
    public static void main(String[] args) {
        String str = "aabbbccaaaqajkvlsdksaaaa";
        char ch = 'a';
        System.out.println(count(str, ch));
    }

    private static int count(String str, char ch) {
        int count = 0;
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
