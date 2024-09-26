package Questions.Stringss;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntToDoubleFunction;

public class OccuranceOfStringUsingHashMap {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("my name ");
        System.out.println(mapOccurance(str));

    }

    private static HashMap<Character, Integer> mapOccurance(StringBuffer str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0;i<str.length();i++){
            int count = 0;
            char ch = str.charAt(i);
            if (ch == '*'){
                continue;
            }
            for (int j = 0;j<str.length();j++){
                if (str.charAt(j) == ch){
                    count++;
                    str.setCharAt(j,'*');
                }
            }
            map.put(ch,count);
        }
        return map;

    }
}
