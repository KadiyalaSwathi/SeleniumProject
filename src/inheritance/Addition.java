package inheritance;

public class Addition  {

    public static void main(String[] args) {
    //Normal program
        Addition ad = new Addition();
        ad.add(10,20);
    }

    public void add(int a, int b){

        int c=a+b;
        System.out.println("Sum of a and b is: "+c);

    }
}
