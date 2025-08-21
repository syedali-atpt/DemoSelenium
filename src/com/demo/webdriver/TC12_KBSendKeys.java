package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12_KBSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 //navigating to google
		 driver.get("https://www.google.com/");
		 Thread.sleep(3000);
		 
		 //selecting text box and writing data
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("rajasab",Keys.ENTER);
		 
		 Thread.sleep(5000);
		 
		 driver.quit();
			
	}
	
}
