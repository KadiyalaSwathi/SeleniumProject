package assignmentLevel1;

public class PrintingTextOnMultiplesOfThree {

    //For each multiple of 3, print "Fizz" instead of the number.

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){

            if(i%3==0){

                System.out.println("Fizz");
            }

            else{

                System.out.println(i);
            }
        }
    }
}
