package Questions.Concepts;

public class Constructers {
    Constructers(){
        System.out.println("parent class constructer");
    }
}
class Const2 extends Constructers{
    Const2(){

        System.out.println("child class constructer");
    }

    public static void main(String[] args) {
        Const2 c = new Const2();
    }
}
