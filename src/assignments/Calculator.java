package assignments;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator cl = new Calculator();
        cl.addition();
        int diff = cl.subtraction();
        System.out.println("Diff b/n a and b is: "+diff);
        multiplication();
        cl.div(100,20);

    }

    public void addition(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Enter b value: ");
        int b = Integer.parseInt(scanner.next());
        int c=a+b;
        System.out.println("addition of a and b values are: "+c);

    }

    public int subtraction(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Enter b value: ");
        int b = Integer.parseInt(scanner.next());
        return a-b;

    }

    public static void multiplication(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Enter b value: ");
        int b = Integer.parseInt(scanner.next());
        int c=a*b;
        System.out.println("Multiplication of a and b is:"+c);
    }

    public void div(int a,int b){
        int c=a/b;
        System.out.println("Divison of a and b is:"+c);
    }

}
