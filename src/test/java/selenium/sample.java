package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
    }
}
