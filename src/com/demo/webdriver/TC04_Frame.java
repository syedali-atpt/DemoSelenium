package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_Frame {
	public static void main(String[] args) throws InterruptedException {

		// WebDriver - interface => no object
		// invoke the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate to frames app
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(5000);

		// finding the textbox and sending data
//		WebElement textBox= driver.findElement(By.xpath("//input[@fdprocessedid=\"bt6bei\"]"));
		// swithching to frame - by id, name, index
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hello");

		// any error => manually check -> add wait -> check xpath ->check frame
		// wait
		Thread.sleep(3000);

		// closing browser
		// for closing current driver instance
//		driver.close();
		// for closing all driver instances
		driver.quit();

	}
}
