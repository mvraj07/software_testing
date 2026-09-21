package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class accessElements {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aikrushimitra.in");
        List<WebElement> elements = driver.findElements(By.tagName("div"));
        System.out.println(elements);
        driver.quit();
    }
}
