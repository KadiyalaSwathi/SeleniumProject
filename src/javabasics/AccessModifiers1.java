package javabasics;

public class AccessModifiers1 {

    public static void main(String[] args) {

        AccessModifiers1 ex = new AccessModifiers1();
        ex.publicMethod();
        ex.privateMethod();
        ex.protectedMethod();
        ex.defaultMethod();

    }

    public void publicMethod(){
        System.out.println("This is a public method");

    }

    private void privateMethod(){
        System.out.println("This is a private method");

    }

    protected void protectedMethod(){
        System.out.println("This is a protected method");

    }

    void defaultMethod(){

        System.out.println("This is a default method");
    }

}
