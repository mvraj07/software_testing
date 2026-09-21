package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_Automation {
    public static void main(String[] args) throws Exception{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com");
       WebElement email = driver.findElement(By.name("email"));
       email.sendKeys("mvraj7898@gmail.com");
       WebElement password = driver.findElement(By.name("pass"));
       password.sendKeys("Raj@333333");
      driver.findElement(By.linkText("Log in")).click();

//       Thread.sleep(2000);
//       driver.quit();
    }
}
