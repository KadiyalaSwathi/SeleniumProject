package assignmentLevel1;

public class StringReplace {

    /*
    *Write a Java program to replace a specified character with another character
- Sample Output:
   - Original string: The quick brown fox jumps over the lazy dog.
   - New String: The quick brown fox jumps over the lazy fog.*/

    public static void main(String[] args) {

        String OriginalText="The quick brown fox jumps over the lazy dog";
        String newText = OriginalText.replace('d','f');
        System.out.println(newText);
    }

}
