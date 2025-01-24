package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleList1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Swathi");
        names.add("Aaradhya");
        names.add("Pranav");

       /* Iterator it = names.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }*/

        ListIterator it = names.listIterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}
