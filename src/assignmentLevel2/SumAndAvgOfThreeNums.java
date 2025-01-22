package assignmentLevel2;

import java.util.Scanner;

public class SumAndAvgOfThreeNums {

    public static void main(String[] args) {

        System.out.println("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter b value: ");
        int b = scanner.nextInt();

        System.out.println("Enter c value: ");
        int c = scanner.nextInt();

        int sum=a+b+c;
        System.out.println("Sum of three numbers is: "+sum);

        double avg = (a+b+c)/3;
        System.out.println("Average of three numbers is: "+avg);
    }

}
