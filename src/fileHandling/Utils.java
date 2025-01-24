package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.in;

public class Utils {

    public static String getValue(String key) throws IOException {

        String path = System.getProperty("user.dir") + File.separator + "Config.properties";
        String value=null;
        try {
            FileInputStream in = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(in);
            value = prop.getProperty(key);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

      return value;
    }
}
