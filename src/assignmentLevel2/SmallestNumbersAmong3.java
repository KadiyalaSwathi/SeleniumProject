package assignmentLevel2;

import java.util.Scanner;

public class SmallestNumbersAmong3 {

    public static void main(String[] args) {

        System.out.println("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter b value: ");
        int b = scanner.nextInt();

        System.out.println("Enter c value: ");
        int c = scanner.nextInt();

        if(a<b && a<c){
        System.out.println("a value is smaller than b &c");
        }

        else if(b<a && b<c){

            System.out.println("b value is smaller than a &c");
        }

        else{

            System.out.println("c value is smaller than a &b");
        }
    }

}
