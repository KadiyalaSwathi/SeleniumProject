package inheritance;

import org.checkerframework.checker.units.qual.A;

public class HierarchicalInheritance extends Addition{

    public static void main(String[] args) {
//This is hierarchical inheritance where we inherited addition class which is already inherited by Calculator class
        HierarchicalInheritance hi = new HierarchicalInheritance();
        Addition obj = new Addition();
        hi.div();
        hi.add(10,30);
    }

    public void div(){

        int a=20;
        int b=5;
        int c=a/b;
        System.out.println("Modular of a and b is "+c);
    }
}
