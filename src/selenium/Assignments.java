package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Assignments {

    public static  WebDriver driver;

    public static void main(String[] args) {

        System.out.print("Enter name of the browser: ");
    Scanner scanner = new Scanner(System.in);
    String browser = scanner.next();
        switch(browser.toLowerCase()) {
        case "chrome":
            driver =new ChromeDriver();
            break;
        case "firefox":
            driver =new FirefoxDriver();
            break;
        case "edge":
            driver =new EdgeDriver();
            break;
        default:
            System.out.println("Enter a valid browser name");
    }


}
}
