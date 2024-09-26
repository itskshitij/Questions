package Questions.Stringss;

public class ValidateIP {
    public static void main(String[] args) {
        String str = "222.111.111.111";
        //str = "5555.555";
        validateIp(str);
        System.out.println(validateIp(str));
    }

    private static boolean validateIp(String str) {
        String[] arr = str.split("\\.");

        for (int i = 0;i<arr.length;i++){
            int n = Integer.parseInt(arr[i]);
            if(n<0 || n>255){
                return false;
            }
        }

        return true;
    }
}
//Input: str = 222.111.111.111    -> range between 0 - 255
//        Output: true
//        Explanation: Here, the IPv4 address is as per the criteria mentioned and also
//        all four decimal numbers lies in the mentioned range.
