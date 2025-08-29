package com.demo.webdriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC15_TakeScreenshotSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		/*
		 * 1> launch browser
		 * 2> navigating to orangehrm 
		 * 3> login into orangehrm
		 * 4> verify user able to login into wesite by taking ss
		 * 
		 */

		// 1> launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// 2> navigating to orangehrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		// 3> login into orangehrm
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(5000);
		
//		// 4>verify user able to login into wesite by taking ss
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src =ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File("./DemoSelenium/SS/ss.png");
//		
//		//Download Apache Commons io
//		FileUtils.copyFile(src, trg);
		
		
//		//Adding Timestamp
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src =ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File("./DemoSelenium/SS/ss.png");
//		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//		File trg = new File("./DemoSelenium/SS/ss"+timeStamp+".png");
//
//		//Download Apache Commons io
//		FileUtils.copyFile(src, trg);
		
		//getting ss of section or element
		TakesScreenshot ts = (TakesScreenshot) driver;
		WebElement section = driver.findElement(By.xpath("//nav[@aria-label=\"Sidepanel\"]"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File("./DemoSelenium/SS/section.png");
		FileUtils.copyFile(src, trg);
		
		Thread.sleep(3000);
		driver.close();		
	}

}
