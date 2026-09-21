package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {
    public static void main(String[] args)throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        System.out.println(Thread.activeCount());
        Thread. sleep(10000);
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread. sleep(2000);
        driver.quit();
    }
}
