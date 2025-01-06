package javabasics;

public class MethodChaining {

    public static void main(String[] args) {

        new MethodChaining()
                .display()
                .publish();
    }

    public MethodChaining display(){

        System.out.println("This is display method");
        return this;
    }

    public MethodChaining publish(){

        System.out.println("This is publish method");
        return this;
    }
}
