package com.automation.test.validation;

import org.testng.Assert;

import com.automation.common.BrowserManager;

public class BasicTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserManager.setUp();
		// Basic Test Validation1
		verifyMmtHomePageTitle();
		BrowserManager.closeBrowser();

	}

	public static void verifyMmtHomePageTitle() {
		try {
			String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
			String actualTitle = BrowserManager.driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("MMT Title validation successful");
		} catch (AssertionError e) {
			System.out.println("MMT Title validation fails with error: " + e.getMessage());
		}
	}

}
