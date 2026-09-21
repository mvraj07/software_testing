package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        WebElement cna = driver.findElement(By.xpath("//span[text()='Create new account']"));
        cna.click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("raj");
        driver.findElement(By.xpath("//input[@type='text' and @id='_R_1kl2p4jikacppb6amH1_']")).sendKeys("Mahajan");
        driver.findElement(By.xpath("//div[@aria-label='Select day']")).click();
        driver.findElement(By.xpath("//div[text()='1']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Select month']")).click();
        driver.findElement(By.xpath("//div[text()='January']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Select year']")).click();
        driver.findElement(By.xpath("//div[text()='2004']")).click();
        driver.findElement(By.id("_R_mad6p4jikacppb6amH2_")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
