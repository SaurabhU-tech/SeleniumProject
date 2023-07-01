package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe"); 
		//Create the browser driver (It launches the browser with blank URL)
		WebDriver driver = new ChromeDriver();
		//Navigate to specific URL
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//Locating Female Radio Button
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='f']"));
		//Verifying Female Radion button is getting displayed
		System.out.println(femaleRadioButton.isDisplayed()); //true
		//Verifying Female Radion button is getting enabled
		System.out.println(femaleRadioButton.isEnabled()); //true
		//Verifying Female Radion button is getting selected
		System.out.println(femaleRadioButton.isSelected()); //false
		//Selectting Female Radio Button
		Thread.sleep(5000);
		femaleRadioButton.click();
		System.out.println(femaleRadioButton.isSelected()); //true
//		Thread.sleep(5000);
//		driver.close();

		
	}

}
