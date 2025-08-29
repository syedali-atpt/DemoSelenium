package com.demo.webdriver;

import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors {

	public static void main(String[] args) {
		
		// WebDriver - interface => no object
		// invoke the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigating to amazon
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//ID SELECTOR => sending data to search box 
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		
		//ClassName selector => clicking cart
//driver.findElement(By.xpath("//input[@class=\"nav-input nav-progressive-attribute\"][@role=\"searchbox\"]")).sendKeys("AtomicHabits",Keys.ENTER);		
		
		//Name selector
//driver.findElement(By.name("field-keywords")).sendKeys("chair",Keys.ENTER);

		//tag name => to find the links in page
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		
//		for(WebElement link:links) {
//			System.out.println(link.getAttribute("href"));
//		}

		//Link Text
//		driver.findElement(By.linkText("Bestsellers")).click();
//		driver.findElement(By.linkText("Customer Service")).click();
		
		//partial link text
		driver.findElement(By.partialLinkText("Today's")).click();
		
	}
	
	
}
