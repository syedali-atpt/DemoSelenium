package com.demo.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07_KeyAction {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate to test app
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);

		//clicking alert with textbox
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		Thread.sleep(3000);
		
		//clicking on prompt box button
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);

		//enter the data into alert box
		Alert alert =driver.switchTo().alert();
		Thread.sleep(3000);
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_1);

		
//		alert.sendKeys("Test Data");
		Thread.sleep(5000);

	
		Thread.sleep(3000);

		//close the browser
		driver.quit();
	
}}
