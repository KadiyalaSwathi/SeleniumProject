package collections;

public class ExampleArrays {

    public static void main(String[] args) {

        String[] names = {"Swathi","Aaradhya","Pranav"};
        //System.out.println(names[0]);o/p:Swathi

       /* for(int i=0;i<names.length;i++){

            System.out.println(names[i]);
        }*/

        for(String name: names){

            System.out.println(name);
        }
    }


}
