package com.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC08_DropDown {

	public static void main(String[] args) throws InterruptedException {

		// open browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigating your test app
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		WebElement dropDown = driver
				.findElement(By.xpath("//div[@class=\"information closable\"]/following-sibling::p/child::select"));
		Thread.sleep(3000);

		Select select = new Select(dropDown);
		select.selectByIndex(3); // algeria
		Thread.sleep(3000);
		select.selectByVisibleText("Australia");
		Thread.sleep(3000);

		driver.quit();

		// https://testautomationcentral.com/demo/multi_select_dropdown.html
		// select.selectByValue(null);
		// select.deselectAll();

	}

}
