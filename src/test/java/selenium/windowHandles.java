package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String facebook = driver.getWindowHandle();
        driver.findElement(By.linkText("Meta Pay")).click();
//        window handles and switching windows
        Set<String>windowHandles = driver.getWindowHandles();
//        Thread.sleep(5000);
//        driver.switchTo().window(facebook);
//        System.out.println("Facebook: "+facebook);
//        System.out.println("Set: "+windowHandles);
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            Thread.sleep(5000);
        }

        driver.findElement(By.linkText("Check availability")).click();


    }
}
