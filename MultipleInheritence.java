package Questions.Concepts;
interface interf1{
    int number(int a, int b);
}
interface interf2{
    int number2(int a, int b);
}
public class MultipleInheritence implements interf1, interf2 {
    public int number(int a, int b){
        return a+b;
    }
    public int number2(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        MultipleInheritence multipleInheritence = new MultipleInheritence();
        int res = multipleInheritence.number(2,3);
        System.out.println(res);
        int res2 = multipleInheritence.number2(2,3);
        System.out.println(res2);

    }
}
