package com.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
	public static WebDriver driver = null;

	public static void setUp() throws InterruptedException {
        String baseUrl="https://www.makemytrip.com/";
		// In selenium 4, we do not requitre to setup path for chromedriver.

		// initialize wbdriver
		driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// Launch appliaction
		driver.get(baseUrl);
		System.out.println("Application is launched in chrome browser with URL :"+baseUrl);
		Thread.sleep(2000);
		// or -->alternate method
		// driver.navigate().to("\"https://www.makemytrip.com/\"");
	}

	public static void closeBrowser() {
		driver.quit();
		System.out.println("All Browser windows are closed");
	}

}
