package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.OutputStream;
import java.util.List;

public class asssignment {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot)driver;
        Thread.sleep(2000);
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./ss.png"));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cricket Bat");
        driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> elements= driver.findElements(By.xpath("//div[@role='listitem']"));
        System.out.println("Total Items on this Page are: "+elements.size());
        Thread.sleep(2000);
//        driver.findElement(By.);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement elem = driver.findElement(By.className("navFooterLine"));
        jse.executeScript("arguments[0].scrollIntoView()",elem);
        Thread.sleep(2000);
        File source2 = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source2,new File("./ss2.png"));
//driver.quit();

    }
}
