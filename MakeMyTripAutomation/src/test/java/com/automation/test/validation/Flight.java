package com.automation.test.validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.common.BrowserManager;

public class Flight {

	public static void main(String[] args) throws InterruptedException {
		BrowserManager.setUp();

		verifyFlightPage();
		BrowserManager.closeBrowser();

	}

	public static void verifyFlightPage() throws InterruptedException {
		

		Thread.sleep(2000);
	}

}
