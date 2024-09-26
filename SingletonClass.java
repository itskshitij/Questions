package Questions.Concepts;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if (instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
    public static void main(String[] args) {

        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);

        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println(singletonClass1);

    }
}
