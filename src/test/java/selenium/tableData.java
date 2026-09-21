package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class tableData {
    public void FetchDataFromTable(String url)throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\IdeaProjects\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List <WebElement> headings = driver.findElements(By.tagName("th"));
        List <WebElement> data = driver.findElements(By.tagName("td"));
        for(int i=0;i<data.size();i+=4){
            for(int j=0;j<headings.size();j++){
                System.out.println(headings.get(j).getText()+" : "+data.get(i+j).getText());
            }
            System.out.println();
        }
//        System.out.println(headings.getFirst().getText());
        String window = driver.getWindowHandle();
        System.out.println(window);
        driver.quit();
    }
    public static void main(String[] args) throws Exception{
        tableData td = new tableData();
        td.FetchDataFromTable("C:\\Users\\DELL\\IdeaProjects\\Selenium\\src\\test\\java\\selenium\\student_table.html");

    }
}
