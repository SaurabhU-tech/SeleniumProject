package sel_Package;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class editBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		try {
		System.out.println(driver.findElement(By.id("login1")).isDisplayed());
		System.out.println("Element is Displayed");
		System.out.println(driver.findElement(By.id("login1")).isEnabled());
		System.out.println("Element is Enabled");
		driver.findElement(By.id("login1")).sendKeys("India123");
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).clear();
		}
		catch(NoSuchElementException e) {
			System.out.println("Element is either not Displayed or not Enabled");
		}
	}

}
