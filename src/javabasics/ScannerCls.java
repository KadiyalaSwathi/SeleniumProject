package javabasics;

import java.util.Scanner;

public class ScannerCls {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ScannerCls sc = new ScannerCls();
        sc.add();
        sc.Book();
    }

    public void add(){
        System.out.print("Enter value of a: ");
          int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();
        int c=a+b;
        System.out.println("Sum of a and b is:"+c);
    }

    public void Book(){
        System.out.print("Enter name of book: ");
        String bookName =  scanner.next();

        System.out.print("Enter author of book: ");
        String author =  scanner.next();

        System.out.println("Name of the book is "+bookName);
        System.out.println("Author of the book is "+author);
    }

}
