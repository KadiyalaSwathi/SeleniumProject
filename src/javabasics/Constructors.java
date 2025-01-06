package javabasics;

public class Constructors {

    public static void main(String[] args) {

        new Constructors();
        new Constructors(10,20);

    }

    public Constructors() {

        System.out.println("This is a default constructor");
    }

    public Constructors(int a, int b){

        int c=a+b;
        System.out.println(c);


    }

}
