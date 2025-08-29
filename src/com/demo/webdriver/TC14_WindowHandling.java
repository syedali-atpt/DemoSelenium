package com.demo.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_WindowHandling {

	/*
	 * 1. open chrome browser 2. navigate to test app 3. click on mobiles and
	 * tablets
	 * 
	 * 4. click on moto g85 5. click on moto g85 green/blue in search results 6.
	 * move to child tab and click on buy now button 7. go to cart page and verify
	 * item has been added q
	 */

	public static void main(String[] args) throws InterruptedException {

		// 1
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2
		driver.navigate().to("https://www.flipkart.com/");
//		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		// 3
		driver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();
		Thread.sleep(5000);

		// 4
		driver.findElement(By.xpath("//div[6]//div[1]//div[1]//a[1]//div[1]//img[2]")).click();
		Thread.sleep(3000);
		// 5
		driver.findElement(By.xpath("//div[normalize-space()='Motorola G85 5G (Olive Green, 128 GB)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Motorola G85 5G (Cobalt Blue, 128 GB)']")).click();

		// 6
		String parentWindowHandle = driver.getWindowHandle();
		List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());

		/*
		 * Handle (default, unique ID)
		 * 
		 * Index (order-based)
		 * 
		 * Title (full or partial match)
		 * 
		 * URL (full or partial match)
		 */

		// by id switch
//		driver.switchTo().window(parentWindowHandle);

		// by index switch
		driver.switchTo().window(windowHandles.get(0));

		for (String x : windowHandles) {
			driver.switchTo().window(x);
			//switch by page title, page url
//		
		}
	}

}
