package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02_Verification {

/*
tc02- 
launch browser 
navigating to test app
verify the page title 
enter username enter pwd click login
verify page title click logout 
close the  application	 
*/

	public static void main(String[] args) throws InterruptedException {

		String expectedTitle = "OrangeHRM";

		// 1.launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2.navigating to test app
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);

		// 3.verify the page title
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title1 Matched");
		}else {
			System.out.println("Title1 did not Match");

		}

		// 4.enter username and pwd and click login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);

		// 5. verify page title
		String actualTitle2 = driver.getTitle();
		if (actualTitle2.equals(expectedTitle)) {
			System.out.println("Title 2 also matched");
		}else {
			System.out.println("Title2 did not match");
		}
		Thread.sleep(3000);
		
		// 6. logout
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"][@class=\"oxd-userdropdown-img\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		// 7. close browser
		driver.quit();

	}

}