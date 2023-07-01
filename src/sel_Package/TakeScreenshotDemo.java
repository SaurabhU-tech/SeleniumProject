package sel_Package;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.google.common.io.Files;

public class TakeScreenshotDemo {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");

        driver = new ChromeDriver();
        Reporter.log("The Browser is opened now...");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Reporter.log("The Browser is maximized now...");

        driver.get("http://demo.guru99.com/test/");
        
        String BrowserTitle = driver.getTitle();
        System.out.println("Page Title : " + BrowserTitle);
        //Take Screenshot
        takeScreenshot("image");
        
        Thread.sleep(3000);
        driver.quit();
	}
	
	@SuppressWarnings("deprecation")
	private static String getCurrentDateandTime() {
		return new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss").format(new java.util.Date());
	}
	
	private static void takeScreenshot(String screenshotName) throws IOException {
		//Take Screenshot
        TakesScreenshot scrShot = (TakesScreenshot)driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\asus\\eclipse-workspace\\SeleniumProject\\Screenshots\\" + screenshotName + "_" + getCurrentDateandTime() + ".png");
        Files.copy(srcFile, destFile);
	}

}
