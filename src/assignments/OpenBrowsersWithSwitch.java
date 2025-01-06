package assignments;
import java.util.Scanner;
public class OpenBrowsersWithSwitch {

    public static void main(String[] args) {

        System.out.print("Enter name of the browser: ");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        switch(browser.toLowerCase()) {
            case "chrome":
                System.out.println("Chrome browser is opened");
                break;
            case "firefox":
                System.out.println("Firefox browser is opened");
                break;
            case "edge":
                System.out.println("Edge browser is opened");
                break;
            default:
                System.out.println("Enter a valid browser name");
        }


        }

}
