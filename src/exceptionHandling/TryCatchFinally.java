package exceptionHandling;

public class TryCatchFinally {

    public static void main(String[] args) {

        System.out.println("Start of the program");
        int a=10;
        int b=0;
        try{

            int res=a/b;
            System.out.println("Result is: "+res);
        } catch (Exception e) {

            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("End of the program");
    }
}
