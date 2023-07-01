package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username = dr.findElement(By.name("login"));
		username.sendKeys("Saurabh@123");
		WebElement password = dr.findElement(By.name("passwd"));
		password.sendKeys("hahaha@123");
	}

}
