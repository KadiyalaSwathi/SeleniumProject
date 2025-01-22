package assignmentLevel3;

import io.opentelemetry.context.Scope;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Enter an inter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=5;i++){

            System.out.println(n +"x"+ i + "="+n*i);
        }
    }
}
