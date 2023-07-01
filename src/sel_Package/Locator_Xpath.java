package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {

	private static String Xpath = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Locating Search Edit box and entering the value in it
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		
		//“contains” function is used for finding dynamic web element
		Thread.sleep(3000);
		//driver.get("https://www.google.com");
		//contains not done
		
		//“text()” method is used to find web element with exact text match
		String s = driver.findElement(By.xpath("//b[text()='Temporary Issue. Please try again later. [#5002]']")).getText();
		System.out.println(s);
		
		//AND & OR expressions can also be use in Selenium Xpath expression
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login1' or @value='saurabh']")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password' and @name='passwd']")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Xpath Axes Method (Parent, Child)//not done

		
	}

}
