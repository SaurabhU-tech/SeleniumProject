package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Locating Search Edit box and entering the value in it
		driver.findElement(By.cssSelector("#login1")).sendKeys("Saurabh@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("India123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > div > div.lft_wrap > "
				+ "div.top_bar > div:nth-child(2) > form > "
				+ "div.floatL.leftwidth > div:nth-child(2) > "
				+ "div:nth-child(2) > div:nth-child(2) > "
				+ "input.signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#login1")).sendKeys("Saurabh@123");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.signinbtn[type='submit'][value='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create a new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.nomargin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#Register")).click();
		Thread.sleep(3000);
		//driver.get("https://register.rediff.com/register/register.php?FormName=user_details"); 
		//identifying the Full Name Edit box in Rediff mail Account page by using Substring (^ sign - prefix of the text) of attribute value details in CSS selector
//		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("India123");	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.signup[type='submit'][value='sign me up']"));
	}

}
