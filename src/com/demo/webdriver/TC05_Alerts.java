package com.demo.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05_Alerts {

	public static void main(String[] args) throws InterruptedException {

		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\DemoSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate to test app
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		// click on alert with ok option
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(3000);
		//click button to display alert box
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(5000);

		//accept the alert*
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		Thread.sleep(3000);
		System.out.println(alertMsg);
		alert.accept();
		Thread.sleep(3000);

		//close the browser
		driver.close();

//alert.dismiss();
//alert.sendKeys("data");

	}

}
