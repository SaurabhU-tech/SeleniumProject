package sel_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Date_and_Time_Picker {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");

        driver = new ChromeDriver();
        Reporter.log("The Browser is opened now...");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Reporter.log("The Browser is maximized now...");

        driver.get("http://demo.guru99.com/test/");
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
		Reporter.log("The Browser is closed now...");
	}
	@Test (priority = 1)
	public void dateTimePicker() throws InterruptedException {
		//Find the date time picker control
		
        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
        Thread.sleep(2000);

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("09252013");
        Reporter.log("The Date is entered now...");
        Thread.sleep(3000);

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dateBox.sendKeys("0245PM");
        Reporter.log("The Time is entered now...");
        Thread.sleep(3000);
	}
	
	@Test (priority = 2)
	public void dateTimePicker2() throws InterruptedException {
		//Find the date time picker control
		
        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
        Thread.sleep(2000);

        //Fill date as mm/dd/yyyy as 10/12/2020

        dateBox.sendKeys("10122020");
        Reporter.log("The Date is entered now...");
        Thread.sleep(3000);

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 12:00 AM

        dateBox.sendKeys("1200AM");
        Reporter.log("The Time is entered now...");
        Thread.sleep(3000);
	}

}
