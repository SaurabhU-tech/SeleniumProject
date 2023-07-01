package sel_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");

        driver = new ChromeDriver();
        Reporter.log("The Browser is opened now...");
        
        driver.manage().window().maximize();
        Reporter.log("The Browser is maximized now...");

        driver.get("https://www.flipkart.com");
        
        String BrowserTitle = driver.getTitle();
        System.out.println("Page Title : " + BrowserTitle);
        Thread.sleep(6000);
        
        //Closing Popup window
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
        
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//div[text()='Fashion']"))).
        pause(Duration.ofSeconds(3)).
        build().
        perform();
        
        Thread.sleep(3000);
        
        builder.moveToElement(driver.findElement(By.xpath("//a[text()='Women Ethnic']"))).
        pause(Duration.ofSeconds(3)).
        build().
        perform();
        
        Thread.sleep(6000);


        driver.quit();

	}

}
