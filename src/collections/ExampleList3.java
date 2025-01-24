package collections;

import java.util.ArrayList;

public class ExampleList3 {

    public static void main(String[] args) {

        ArrayList<Object> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("selenium");

        ArrayList<Object> fees = new ArrayList<>();
        fees.add(1000);
        fees.add(1200);
        fees.add(courses);

        for(Object fee: fees){

            System.out.println(fee);
        }

    }
}
