package polyMorphismPkg;

public class Test2 extends Test1 {

    public static void main(String[] args) {

        Test2 obj = new Test2();
        obj.add();
    }

    @Override
    public int add() {

        int a = 10;
        int b = 20;
        return a+b;

    }
}

