package exceptionHandling;

public class tryCatch1 {

    public static void main(String[] args) {

        int a=10;
        int b=0;
        try {
            System.out.println("Start of the program");
            int c=a/b;
            System.out.println("Result is: "+c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }
    }



