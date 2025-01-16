package abstraction;

public class IOS extends Abstraction{

    public static void main(String[] args) {

        IOS obj = new IOS();
        obj.click();
        obj.doubleTap();
    }


    @Override
    void click() {

        System.out.println("Click method");
    }

    @Override
    void doubleTap() {
        System.out.println("double tap method");
    }
}
