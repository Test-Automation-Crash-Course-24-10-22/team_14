package ua.com.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1 {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\IdeaProjects\\kusr14\\chromedriver.exe");//C:\Users\home\IdeaProjects\kusr14\chromedriver.exe -- "C:\\Users\\home\\Documents\\GitHub\\team_14\\kusr14\\chromedriver.exe"


        WebDriver driver = new ChromeDriver();
=======
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\IdeaProjects\\kusr14\\chromedriver.exe");//C:\Users\home\IdeaProjects\kusr14\chromedriver.exe
>>>>>>> parent of 68db22d (1.2.2)

        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/ua/");
    }
}
