package exceptionHandling;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class tryCatch {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        try {
            System.out.println("Start of the program");
            int c=a/b;
            System.out.println("Result is: "+c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }

}
