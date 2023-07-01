package sel_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextAreaErrorMessagePopupWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Handling Text Area
		System.out.println(driver.findElement(By.className("create-new-account")).getText());
		
		//Handling Alert
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("Saurabh44444");
		driver.findElement(By.className("signinbtn")).click();
		//Switch the driver control from web page to popup alert
		Alert popup = driver.switchTo().alert();
		String errorMessage = popup.getText();
		System.out.println(errorMessage);
		Thread.sleep(5000);
		popup.accept();
		
		//Handling Error Message
		Thread.sleep(5000);
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys("India123");
		driver.findElement(By.id("password")).sendKeys("India123");
		driver.findElement(By.name("proceed")).click();
		System.out.println(driver.findElement(By.id("div_login_error")).getText());
	}
}
