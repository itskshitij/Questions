package Questions.Stringss;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "elloh";
        System.out.println(checkAnagram(str, str1));

    }

    private static boolean checkAnagram(String str, String str1) {
        if (str.length() != str1.length()){
            return false;
        }
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != arr1[i]){
                return false;
            }
        }

        return true;
    }
}
