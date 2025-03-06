import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCases {
    WebDriver driver = new ChromeDriver();
    @Test
    void loginSystem(){
        driver.get("https://beta.rcms.gov.bd/login/");
        driver.findElement(By.id("userId")).sendKeys("PUA.BEL@rcms.gov.be");
        driver.findElement(By.id("loginPass")).sendKeys("Secr3t");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"designationForm\"]/div/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Alison");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Burger");

    }
}
