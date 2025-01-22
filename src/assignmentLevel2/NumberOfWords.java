package assignmentLevel2;

public class NumberOfWords {

    public static void main(String[] args) {

        String name="welcome to java and selenium classes";
        int words=0;
        for(int i=0;i<name.length();i++){

           char ch= name.charAt(i);
           if(ch==' '){

               words++;
           }
        }

        System.out.println(words+1);
    }


}
