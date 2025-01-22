package assignmentLevel2;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter b value: ");
        int b = scanner.nextInt();

        System.out.println("Enter c value: ");
        int c = scanner.nextInt();

        double avg = (a+b+c)/3;
        System.out.println(avg);
    }


}
