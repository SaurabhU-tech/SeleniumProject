package sel_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHTML_table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_orderby.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("w3-responsive"));
		//Creating reference for rows	
		List <WebElement> rows = webtable.findElements(By.tagName("tr"));
		//Finding number of rows in webtable
		int noofrows = rows.size();
		System.out.println("No of rows in webtable are:  " +noofrows);
		//Creating reference for cells
		List <WebElement> cells = webtable.findElements(By.tagName("td"));
		//Finding number of cells in webtable
		int noofcells = cells.size();
		System.out.println("No of cells in webtable are:  " +noofcells);
		//Creating reference for header
		List <WebElement> headers = webtable.findElements(By.tagName("th"));
		//Finding number of header in webtable
		int noofheaders = headers.size();
		System.out.println("No of headers in webtable are:  " +noofheaders);
		
		String xpath1 = "//*[@id=\"main\"]/div[4]/table/tbody/tr[";
		String xpath2 = "]/td[";
		String xpath3 ="]";
		
		for(int i = 2; i <= 6; i++) {
			for (int j = 1; j <= 7; j++) {
				String ActualXpath = xpath1 + i + xpath2 + j + xpath3;
				WebElement element = driver.findElement(By.xpath(ActualXpath));
				System.out.print(element.getText() + "\t");
			}
			System.out.println();
		}
	}

}
