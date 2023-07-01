package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildSub_ChildElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		// Child combinatory (>) is used to select the direct child
		driver.findElement(By.cssSelector("select#country>option[value='29']")).click();
		Thread.sleep(3000);
		
		//CSS Selector – Next Sibling
		driver.findElement(By.cssSelector("input[value='m']+input[value='f']")).click();
				
		//identifying the Full Name Edit box in Rediff mail Account page by using Substring (^ sign - prefix of the text) of attribute value details in CSS selector
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("India123");
		
		//Not done above
		Thread.sleep(3000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// Descendant combinatory space( ) is used to select the child or subchild
		driver.findElement(By.cssSelector("form.loginform input[id='login1']")).sendKeys("Sauarabh12345");

	}

}
