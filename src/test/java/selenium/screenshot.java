package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class screenshot {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot)driver;
        Thread.sleep(2000);
        File source = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source,new File("./sc.png"));



//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        WebElement imdb = driver.findElement(By.tagName("h5"));
//        Thread.sleep(7000);
//        jse.executeScript("arguments[0].scrollIntoView(true);",imdb);
//        Thread.sleep(5000);
//        imdb.click();
//        driver.quit();
    }
}
