package assignments;
import java.util.Scanner;

public class Calculator {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x= scanner.nextInt();
        System.out.print("Enter y value: ");
        int y= scanner.nextInt();
        Calculator cl = new Calculator();
        cl.addition();
        int diff = cl.subtraction(x,y);
        System.out.println("Diff b/n x and y is: "+diff);
        multiplication();
        cl.div(x,y);

    }

    public void addition(){
        System.out.print("Enter a value: ");
        int a = scanner.nextInt();
        System.out.print("Enter b value: ");
        int b = scanner.nextInt();
        int c=a+b;
        System.out.println("addition of a and b values are: "+c);

    }

    public int subtraction(int a, int b){
        return a-b;

    }

    public static void multiplication(){
        System.out.print("Enter a value: ");
        int a = scanner.nextInt();
        System.out.print("Enter b value: ");
        int b = scanner.nextInt();
        int c=a*b;
        System.out.println("Multiplication of a and b is:"+c);
    }

    public void div(int x,int y){
        int z=x/y;
        System.out.println("Divison of x and y is:"+z);
    }

}
