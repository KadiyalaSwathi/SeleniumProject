package assignmentLevel2;

import java.util.Scanner;

public class GivenIntegerPositiveOrNegative {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){

            System.out.println("Given number is positive");
        }

        else if(a<0){

            System.out.println("Given number is negative");
        }

        else{

            System.out.println("Given number is zero");
        }
    }
}
