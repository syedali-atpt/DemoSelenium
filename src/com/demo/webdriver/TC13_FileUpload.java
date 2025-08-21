package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		//navigating to test app
		 driver.navigate().to("https://practice.expandtesting.com/upload");
		 Thread.sleep(3000);
		 
		 //clicking on fileupload button
		 driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("E:\\pic\\pic.jpg");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Upload']")).click();
		 
		 //if file uploaded text is displayed
		WebElement ele= driver.findElement(By.xpath("//nav[@aria-label=\"breadcrumb mb-2\"]"));
		String fileMsg = ele.getText();
		System.out.println("file upload status: "+fileMsg);
		Thread.sleep(3000);
		
		driver.quit();
		 
		 
	}
	
}
