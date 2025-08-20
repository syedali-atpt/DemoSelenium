package com.demo.webdriver;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC10_Waits {

	public static void main(String[] args) throws InterruptedException {

		// wait => implicit/explicit/fluet/pageload timeout

		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate to test app
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//page load timeout
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// sending username and pwd
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		

//		//Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		WebElement watch = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]")));
//		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]")).click();
		
		//Fluent wait
		FluentWait<WebDriver> wait2 = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(16))      // total timeout
		        .pollingEvery(Duration.ofSeconds(2))      // polling interval
		        .ignoring(NoSuchElementException.class);  // ignore if not found yet
	
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]")));
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]")).click();

		// logout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"][@class=\"oxd-userdropdown-img\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

		//close browser
		driver.quit();
		
	}

}
