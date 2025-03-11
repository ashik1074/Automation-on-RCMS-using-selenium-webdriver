import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testCases {
    WebDriver driver = new ChromeDriver();

    @Test
    void loginSystem(){
        driver.manage().window().maximize();
        driver.get("https://beta.rcms.gov.bd/login/");
        driver.findElement(By.id("userId")).sendKeys("P********@rcms.gov.be");
        driver.findElement(By.id("loginPass")).sendKeys("******");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"designationForm\"]/div/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Alison");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Burger");
        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
        upload.sendKeys("D:\\My PC\\iSTL\\RCMS\\personImage2.png");

        WebElement observationTab = driver.findElement(By.id("observation-tab"));
        observationTab.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"observation\"]/div[3]/div/div[1]/label"))
        );
        uploadButton.click();


        WebElement submitButton = driver.findElement(By.id("saveNSubmitX"));
        submitButton.click();


        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("saveNSubmit"))
        );
        confirmButton.click();

    }
}
