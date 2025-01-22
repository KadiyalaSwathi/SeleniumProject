package assignmentLevel3;

import java.util.Scanner;

public class NTermsOfOddNaturalNumbers {

    public static void main(String[] args) {

        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int sum=0;
        for(int i=1; i<=term*2;i++){

            if(i%2==1){

                System.out.println(i);
                sum=sum+i;

            }

        }

        System.out.println("Sum of odd numbers are :"+sum);
    }
}
