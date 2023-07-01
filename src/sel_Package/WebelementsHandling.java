package sel_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
//		a)	Launch Browser:
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//b)	Navigate to specific URL:
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);
        //c)	Get the browser title
        String BrowserTitle = driver.getTitle();
        System.out.println(BrowserTitle);
        Thread.sleep(3000);
        //d)	Get the browser URL:
        String BrowserURL = driver.getCurrentUrl();
        System.out.println(BrowserURL);
        Thread.sleep(3000);
        //e)	Get the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        Thread.sleep(3000);
        //f)	Get the browser window handle
        String browserWindowHandle = driver.getWindowHandle();
        System.out.println(browserWindowHandle);
        Thread.sleep(3000);
        //i)	Navigate to another URL:
//        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.navigate().to("https://www.yahoo.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        //j)	Navigate to previous URL:
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        //k)	Navigate to forward:
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        //l)	Refresh the browser:
        driver.findElement(By.tagName("input")).sendKeys("India123");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        //m)	Maximize the browser:
        driver.manage().window().maximize();
        //g)	Close the focused browser
        driver.close();
        Thread.sleep(3000);
        //h)	Close all browser that opened by Selenium
        driver.quit();
        Thread.sleep(3000);
	}

}
