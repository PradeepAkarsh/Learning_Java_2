package basics.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Base_Example {

    public static void main(String[] args) {

        String url = Generic.getValue("url"),browser = Generic.getValue("browser");
        WebDriver driver = null;


        if (browser.equalsIgnoreCase("chrome")) {
             driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
             driver = new FirefoxDriver();
        }
        driver.get(url);
    }
}
