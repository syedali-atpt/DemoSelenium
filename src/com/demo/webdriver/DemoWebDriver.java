package com.demo.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		// WebDriver - interface => no object
		System.setProperty("webdriver.chrome.driver","C:/Users/Syed Murthuza Ali/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    //maximize or minimize browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		//close window
//		driver.close();
		
		
		
		
	}
	
	
}
