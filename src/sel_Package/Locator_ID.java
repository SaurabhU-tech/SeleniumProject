package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch Rediff mail Signin page
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		//identifying the editbox in Rediff mail Signin page and entering a value
		driver.findElement(By.id("login1")).sendKeys("India123");

	}

}
