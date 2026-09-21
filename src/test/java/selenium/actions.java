package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class actions {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement help = driver.findElement(By.linkText("Help"));
        Actions actions = new Actions(driver);
//        Action action = actions.moveToElement(help).build();
//        action.perform();
//        Action rightClick = actions.moveByOffset(100,100).contextClick().build();
//        rightClick.perform();
//        Action rigRemove = actions.moveByOffset(50,50).contextClick().build();
//        rigRemove.perform();
//        help.click();
        WebElement icon = driver.findElement(By.id("nav-logo-sprites"));
        Action hold = actions.clickAndHold(icon).build();
        Action drag = actions.moveByOffset(500,500).build();
        Thread.sleep(4000);
        Action release = actions.release().build();
        hold.perform();
        drag.perform();
        release.perform();

//        actions.dragAndDropBy(help,50,50).perform();

    }
}
