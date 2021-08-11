package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	WebDriver driver = null;

	@BeforeTest

	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				projectPath + "C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chrome.exe");
		driver = new ChromeDriver();

	}

	@Test

	public void googleSerach() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step setup");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.close();

		System.out.println("Test completed successfully");
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");

	}

}
