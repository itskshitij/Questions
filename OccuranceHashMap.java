package Questions.Stringss;

import java.util.HashMap;

public class OccuranceHashMap {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("my name ");
        System.out.println(mapOccurance(str));
    }

    private static HashMap<Character, Integer> mapOccurance(StringBuffer str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0;i<str.length();i++){
            int count = 0;
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                count++;
            }
            map.put(ch, count);
        }
        return map;
    }
}
