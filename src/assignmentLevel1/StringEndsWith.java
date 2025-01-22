package assignmentLevel1;

public class StringEndsWith {

    /*Java program to check whether a given string ends with the contents of another string
    Sample Output:
            "Python Exercises" ends with "se"? false
            "Python Exercise" ends with "se"? */

    public static void main(String[] args) {

        String text="Python Exercises";

        System.out.println(text.endsWith("se"));
        System.out.println(text.endsWith("es"));
    }


}
