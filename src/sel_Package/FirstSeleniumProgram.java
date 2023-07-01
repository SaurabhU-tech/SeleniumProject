package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Spiderman");
		driver.findElement(By.id("pass")).sendKeys("India123");
//		driver.findElement(By.id("u_0_d_ZF")).click();
		driver.close();
	}

}
