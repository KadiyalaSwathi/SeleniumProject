package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFileReading {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator + "Config.properties";
        FileInputStream in = null;
        try {
            in = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();
        prop.load(in);
        String value = prop.getProperty("browser");
        System.out.println(value);
    }
}
