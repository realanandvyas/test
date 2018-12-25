package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class MyClass {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();


        driver.get("https://release.datakonnect.com");

        driver.manage().window().maximize();

        // find the Click button
        driver.findElement(By.id("startIco")).click();


    }
}