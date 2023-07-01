package sel_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class PerformDoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");

        driver = new ChromeDriver();
        Reporter.log("The Browser is opened now...");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Reporter.log("The Browser is maximized now...");

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        
        String BrowserTitle = driver.getTitle();
        System.out.println("Page Title : " + BrowserTitle);
        WebElement btn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions builder = new Actions(driver);
        builder.doubleClick(btn).build().perform();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String AlertText = alert.getText();
        String ExpectedText = "You double clicked me.. Thank You..";
        Thread.sleep(3000);
        if(AlertText.equals(ExpectedText)) {
        	System.out.println("Double Click Action is Successful...");
        } else {
        	System.out.println("Double Click Action Unsuccessful...");
        }
        alert.accept();
        
        driver.quit();
	}

}
