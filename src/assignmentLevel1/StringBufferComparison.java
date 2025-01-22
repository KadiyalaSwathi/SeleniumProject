package assignmentLevel1;

public class StringBufferComparison {

    public static void main(String[] args) {

        /*
        Write a Java program to compare a given string to the specified string buffer
        Sample Output:
        Comparing example.com and example.com: true
        Comparing Example.com and example.com: false
        */

        String fname="Kadiyala";
        String lname="Swathi";
        StringBuffer sb = new StringBuffer(fname);
        System.out.println(fname.contentEquals(sb));
        System.out.println(lname.contentEquals(sb));
    }

}
