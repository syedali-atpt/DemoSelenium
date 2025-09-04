package com.demo.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC16_WebTable {

	// Reading data from the webtable present in website

	public static void main(String[] args) throws InterruptedException {

		// opening chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();

		// navigating to webtable app
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Thread.sleep(5000);

//		String data=driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[1]/td[3]")).getText();
//		
//		System.out.println(data);

		// Read row data
//		String rowData =driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[1]")).getText();
//		System.out.println(rowData);

		// Read column data
//		List<WebElement> countries = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr/td[2]"));
//		for(WebElement ele:countries) {
//			System.out.println(ele.getText());
//		}

		// Read whole table
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr"));
		for (WebElement row : allRows) {
			System.out.println(row.getText());
			System.out.println();
		}

	}
}
