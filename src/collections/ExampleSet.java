package collections;

import java.util.HashSet;

public class ExampleSet {

    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();
        courses.add("java");
        courses.add("selenium");
        courses.add("python");
        courses.add("java");

        for(String course: courses)

            System.out.println(course);
        }
    }

