package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//Handling Text Area
		System.out.println(driver.findElement(By.className("create-new-account")).getText());
		
		//Locating Checkbox
		WebElement checkbox = driver.findElement(By.id("remember"));
		//Verifying checkbox is selected or not
		System.out.println(checkbox.isSelected());
		//Selecting / Deselecting checkbox
		checkbox.click();
		//Verifying checkbox is selected or not
		System.out.println(checkbox.isSelected());
		Thread.sleep(5000);
	}

}
