package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingImgImgButtonImgLink {

	public static void main(String[] args) throws InterruptedException {
		// Handling Image, Image Button, Image Link
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//Handling Image
		//it will print image title -> Lightning fast free email
		String ImgTitle = driver.findElement(By.className("mailicon")).getAttribute("title");
		System.out.println(ImgTitle);
		
		//Handling Image Button:
		driver.get("https://www.google.com");
		WebElement imageButton = driver.findElement(By.className("gb_A"));
		System.out.println(imageButton.isDisplayed()); //true
		System.out.println(imageButton.isEnabled()); //true
		imageButton.click();
		Thread.sleep(5000);
		System.out.println();
//		driver.close();
		
		//Handling Image Link:
		driver.get("https://chromedriver.chromium.org/capabilities");
		WebElement imageLink = driver.findElement(By.className("lzy1Td"));
		Thread.sleep(5000);
		System.out.println(imageLink.isDisplayed()); //true
		System.out.println(imageLink.isEnabled()); //true
		imageLink.click();//not done
	}

}
