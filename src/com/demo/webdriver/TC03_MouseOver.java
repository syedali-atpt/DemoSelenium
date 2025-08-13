package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC03_MouseOver {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver - interface => no object
		// invoke the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigating your test app - orangehrm demo
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		

		// enter username and pwd and click on login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		//moving to time symbol and click 
		Actions action = new Actions(driver);
		WebElement time = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-stopwatch\"]"));
		action.moveToElement(time).click().build().perform();
		Thread.sleep(5000);
		
		//verifying the timesheet heading is present
		WebElement timesheet = driver.findElement(By.xpath("//span[text()='Timesheets ']"));
if(timesheet.isDisplayed()) {
	System.out.println("Navigated successfully to Timesheet Page");
}else {
	System.out.println("Failed to navigate to Timesheet Page, current page is "+driver.getTitle());
}
		Thread.sleep(5000);
		// logout
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"][@class=\"oxd-userdropdown-img\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

		// close the browser
		driver.close();

	}

}
