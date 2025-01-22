package assignmentLevel1;

public class PrintingNumbersOnMultiplesOfFive {

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){

            if(i%5==0){

                System.out.println("Buzz");
            }

            else{

                System.out.println(i);
            }
        }
    }
}
