package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC17_TestDataParam {
	
	//APP - Dev/ SIT/ UAT/ Prod
	//url for this servers also change
	
	//

	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String username = "Admin2";
	static String password = "12345452452525";
	
	public static void main(String[] args) throws InterruptedException {

		// WebDriver - interface => no object
				// invoke the driver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// navigating your test app - orangehrm demo
				driver.navigate().to(url);
//				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(2000);

				// enter username and pwd
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(password);
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
