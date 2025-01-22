package fileHandling;

import java.io.*;

public class ExampleFileReading {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"Employee.txt";
        System.out.println(path);

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line=null;
        while((line=br.readLine())!=null){

            System.out.println(line);
        }
    }

}
