package inheritance;

public class Operators extends Calculator{

    public static void main(String[] args) {
    //Multi level inheritance, here Calculator is parent class which already extends Addition class
        // so here we can access add method from addition class, subtraction method from calculator class
        Operators op = new Operators();
        op.multiplication();
        op.add(10,20);
        op.subtraction(10,5);

    }
    public void multiplication(){

        int a=10;
        int b=2;
        int c=a*b;
        System.out.println("Multiplication of a and b is: "+c);
    }
}
