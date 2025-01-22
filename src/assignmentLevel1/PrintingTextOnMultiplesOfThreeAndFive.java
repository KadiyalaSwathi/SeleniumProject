package assignmentLevel1;

public class PrintingTextOnMultiplesOfThreeAndFive {

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){

            if(i%3==0 || i%5==0){

                System.out.println("FizzBuzz");
            }

            else{

                System.out.println(i);
            }
        }
    }

}
