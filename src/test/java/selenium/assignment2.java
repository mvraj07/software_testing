package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class assignment2 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/flights");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement elem = driver.findElement(By.className("topbarInputBox"));
        jse.executeScript("arguments[0].scrollIntoView()",elem);
        elem.sendKeys("786786786");
        Thread.sleep(2000);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./scre.png"));
        driver.quit();



    }
}
