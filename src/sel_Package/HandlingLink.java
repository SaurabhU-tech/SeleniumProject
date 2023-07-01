package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		//Create the browser driver (It launches the browser with blank URL)
		WebDriver driver = new ChromeDriver();
		//Navigate to specific URL
		driver.get("http://www.google.com");
		Thread.sleep(4000);
		String elementType = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(elementType);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
