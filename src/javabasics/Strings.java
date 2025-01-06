package javabasics;

public class Strings {

    public static void main(String[] args) {

        long start=System.currentTimeMillis();
        StringBuffer sb= new StringBuffer("welcome");
        for(int i=0;i<100000;i++){

            sb.append("to java");

        }

        System.out.println("Time taken by string buffer is: "+(System.currentTimeMillis()-start)+"ms");

        start=System.currentTimeMillis();
        StringBuilder sb1= new StringBuilder("welcome");
        for(int i=0;i<100000;i++){

            sb1.append("to java");

        }

        System.out.println("Time taken by string builder is: "+(System.currentTimeMillis()-start)+"ms");
}

}
