package sel_Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://www.javatpoint.com/");
		
		// Mazimize current window
		driver.manage().window().maximize();
		
		//Delay execution for 4 seconds to view the maximize operation
		Thread.sleep(4000);

		// Scroll down the webpage by 4500 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 4500)");

	}

}
