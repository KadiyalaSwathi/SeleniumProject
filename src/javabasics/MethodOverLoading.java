package javabasics;

public class MethodOverLoading {

    public static void main(String[] args) {

        MethodOverLoading mo = new MethodOverLoading();
        mo.add();
        mo.add(10,20);
        mo.add(10,20,30);
        mo.add(10,20.67);

    }


    public void add(int a, int b){

        int c=a+b;
        System.out.println("Sum of a and b is: "+c);

    }

    public void add(int a, int b, int c){

        int d=a+b+c;
        System.out.println("Sum of a,b and c is:"+d);
    }

    public void add(){

        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Sum of a and b is: "+c);
    }

    public void add(int a, double b){

        double c=a+b;
        System.out.println(c);

    }
}
