package ua.com.rozetka;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/home/Downloads/chromedriver_win32/chromedriver_win32");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/ua/");
    }
}
