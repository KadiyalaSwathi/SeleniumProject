
package fileHandling;

import java.io.File;
import java.io.IOException;

public class ExampleFileCreation {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"Employee.txt";
        System.out.println(path);

        File file = new File(path);

        if(file.exists()){

            System.out.println("File already exists");
        }
        else {
            file.createNewFile();
        }
    }
}
