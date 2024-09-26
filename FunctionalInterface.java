package Questions.Concepts;
interface interf{
    int number(int a, int b);
}
public class FunctionalInterface{
    public static void main(String[] args) {
        interf interf = (a, b)-> a+b;
        interf interf1 = (a,b) -> a*b;


        int res = interf.number(2,3);
        int res1 = interf1.number(2,3);

        System.out.println(res +" : "+res1);

    }

}
