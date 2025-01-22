package exceptionHandling;

public class ExampleThrowThrows {

    public static void main(String[] args) throws Exception {

        int a=99;
        if(a<100){
                throw new Exception("Amount is less than 100");
        }
        else{

            System.out.println("Collect your cash");
        }
    }
}
