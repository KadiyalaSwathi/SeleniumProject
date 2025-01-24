package fileHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.Scanner;
public class PropFileReadingWithUtils {

    public static void main(String[] args) throws IOException {
       String browser = Utils.getValue("browser"), url = Utils.getValue("url");
       System.out.println(browser);
       System.out.println(url);
    }

}
