package Questions.Stringss;

import java.util.Arrays;

public class CheckStringRotationofOtherString {
    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "deabc";
        System.out.println( checkRotation(str1, str2));

    }
    private static boolean checkRotation(String str1, String str2) {
        String check = str1+str1;
        int bigLength = check.length();
        int smallLength = str2.length();
        for (int i = 0;i<bigLength - smallLength; i++){
            int j;
            for (j = 0;j<smallLength;j++){
                if(check.charAt(i+j) != str2.charAt(j)){
                    break;
                }
            }
            if (j == smallLength){
                return true;
            }

        }


        return false;
//        String check = str1 +str1;
//        System.out.println(check+" "+str1+" "+str2);
//        if (check.contains(str2)){
//            return true;
//        }
//        if (str1.length() != str2.length()){
//            return false;
//        }
//        char[] arr = str1.toCharArray();
//        char[] arr1 = str2.toCharArray();
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//        for (int i = 0;i< arr.length;i++){
//            if (arr[i] != arr1[i]){
//                return false;
//            }
//        }
//
//        return true;
    }
}
