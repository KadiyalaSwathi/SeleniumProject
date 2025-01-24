package collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Swathi");
        names.add("Aaradhya");
        names.add("Pranav");

        //System.out.println(names);
        /*for(int i=0;i<names.size();i++){

            System.out.println(names.get(i));
        }*/

        for(String name: names){

            System.out.println(name);
        }
    }
}
