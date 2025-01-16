package polyMorphismPkg;

public class TestExample {

    public static void main(String[] args) {
        Test1 obj1;
        obj1 = new Test2();
        System.out.println(obj1.add());
        obj1=new Test3();
        System.out.println(obj1.add());


    }

}
