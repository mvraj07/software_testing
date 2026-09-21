package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementAcesss {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://aikrushimitra.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@title,'English')]")).click();
//        driver.findElement(By.xpath("//button[text()='Product']")).click();
        driver.findElement(By.cssSelector("button.text-black")).click();
    }
}
