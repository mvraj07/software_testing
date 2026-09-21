package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class image {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tickets.paytm.com/bus/");
        driver.manage().window().maximize();
        String link = driver.findElement(By.xpath("//img[@alt='Paytm Logo']")).getAttribute("src");
        System.out.println(link);

    }
}