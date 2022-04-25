import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseUtil{
    WebDriver driver = new ChromeDriver();

    @Test
    void openG(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("as it was \n");

    }

    @Test
    void checkSearchResult(){

    }


}
