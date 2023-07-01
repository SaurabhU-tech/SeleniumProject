package sel_Package;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//Verifying dropdown is getting displayed
		System.out.println(driver.findElement(By.id("country")).isDisplayed());
		//Verifying dropdown is enabled
		boolean CheckEnabled = driver.findElement(By.id("country")).isEnabled();
		System.out.println(CheckEnabled);
		System.out.println(driver.findElement(By.id("country")).isSelected());
		
		//Creating the object of dropdown
		Select dropdown = new Select(driver.findElement(By.id("country")));
		//Selecting the value from dropdown
		dropdown.selectByVisibleText("Austria");
		//dropDown.selectByIndex(2);
		Thread.sleep(3000);
		List <WebElement> e = (List<WebElement>) dropdown.getOptions();
		System.out.println(e.size());
		for(WebElement country:e) {
			System.out.println(((org.openqa.selenium.WebElement) country).getText());
		}
//		driver.close();
	}

}
