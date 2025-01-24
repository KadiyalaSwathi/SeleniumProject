package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleList2 {

    public static void main(String[] args) {

        ArrayList<Object> fee = new ArrayList<>();
        fee.add(1000);
        fee.add(1200);
        fee.add(800);

        Iterator it = fee.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}
