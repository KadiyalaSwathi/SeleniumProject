package javabasics;

public class AccessModifiers2 {

    public static void main(String[] args) {

        AccessModifiers1 ex = new AccessModifiers1();
        ex.publicMethod();
        //ex.privateMethod();
        ex.protectedMethod();
        ex.defaultMethod();
    }
}
