package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_LoginLogout {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver - interface => no object
		// invoke the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigating your test app - orangehrm demo
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		// enter username and pwd
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);

		// logout
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"][@class=\"oxd-userdropdown-img\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

		// close the browser
		driver.close();
	}

}
