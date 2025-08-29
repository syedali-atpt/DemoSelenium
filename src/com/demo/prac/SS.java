package com.demo.prac;

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

public class SS {

	public static void main(String[] args) throws InterruptedException, IOException {

		// invoke the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigating your test app - orangehrm demo
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		// enter username and pwd
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src =ts.getScreenshotAs(OutputType.FILE);
		WebElement ele = driver.findElement(By.xpath("//nav[@aria-label=\"Sidepanel\"]"));

		File src = ele.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		File trg = new File("./DemoSelenium/Screenshot/ss" + timeStamp + ".png");
		FileUtils.copyFile(src, trg);

//		WebElement ele = driver.findElement(By.xpath("//nav[@aria-label=\"Sidepanel\"]"));

	}

}
