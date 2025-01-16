package abstraction;

public class Android extends Abstraction{

    public static void main(String[] args) {
        Android obj = new Android();
        obj.click();
        obj.doubleTap();
        obj.takePicture();

    }


    @Override
    void click() {
        System.out.println("Click method");
    }

    @Override
    void doubleTap() {
        System.out.println("Double tap method");
    }
}
