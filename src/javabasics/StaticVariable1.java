package javabasics;

public class StaticVariable1 {

    static int a=10;
    static int b=20;
    int x=10;
    int y=5;
    public static void main(String[] args) {

        //StaticVariable1 sv = new StaticVariable1();
        add();
        subtraction();

    }

    public static void add(){
         int c=a+b;
        System.out.println("Addition of a and b is:"+c);

    }

    public static void subtraction(){
        StaticVariable1 sv = new StaticVariable1();
        int z = sv.x-sv.y;
        System.out.println("Diff of x and y is: "+z);
    }
}
