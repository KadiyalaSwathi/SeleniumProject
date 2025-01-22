package assignmentLevel2;

public class NumberOfVowels {

    public static void main(String[] args) {

        String name="Kadiyala Swathi";
        int vowelcount=0;
        for(int i=0;i<name.length();i++){

            char ch =  name.toLowerCase().charAt(i);

            if(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u'){

                vowelcount++;
            }

        }

        System.out.println("Total vowels are: "+vowelcount);
    }


}
