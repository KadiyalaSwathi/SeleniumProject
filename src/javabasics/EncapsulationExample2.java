package javabasics;

public class EncapsulationExample2 {

    public static void main(String[] args) {

        EncapsulationExample ex = new EncapsulationExample();
        ex.setName("Swathi");
        System.out.println(ex.getName());
        ex.setAmount(1000);
        System.out.println(ex.getAmount());
        ex.setCvv(123);
        System.out.println(ex.getCvv());


    }


}
