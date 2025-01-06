package inheritance;

public class Calculator extends Addition{

    public static void main(String[] args) {
    //Single inheritance, here we are able to access parent class add method
        Calculator cl = new Calculator();
        int c = cl.subtraction(100,30);
        System.out.println("Difference between a and b is: "+c);

        cl.add(30,10);


    }

    public int subtraction(int a, int b){
        return a-b;
    }
}
