package assignmentLevel1;

public class RemovingDuplicatesFromString {

    public static void main(String[] args) {

        String src = "w3resource";
        char[] arr = src.toCharArray();
        String trg="";
        for(char test :arr){

         if(trg.indexOf(test)==-1){

             trg+=test;

         }

        }

        System.out.println(trg);
    }


}
