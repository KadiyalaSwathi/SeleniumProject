package javabasics;

public class StaticVariables2 {

    static int a=10;
    int b=20;
    public static void main(String[] args) {

        StaticVariables2 sv = new StaticVariables2();
        sv.add();
    }

    public void add(){
       int c=a+b;
       System.out.println("Sum of a and b is: "+c);
    }

}
