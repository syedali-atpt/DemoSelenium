package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC09_DragDrop {

	public static void main(String[] args) throws InterruptedException {

		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate to test app
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000); //java statement
		// implicit wait, explicit wait and Fluent wait, pageload timeout

		
		//drag and drop HighTrash2 image to trash
		driver.switchTo().frame(3);
		Thread.sleep(3000);
		WebElement dragElement = driver.findElement(By.xpath("//ul[@id='gallery']/child::li[2]"));
		WebElement dropElement = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);
		action.dragAndDrop(dragElement, dropElement).build().perform();
		Thread.sleep(5000);

		// close the browser
		driver.quit();

	}

}
