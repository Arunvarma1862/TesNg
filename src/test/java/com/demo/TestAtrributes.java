package com.demo;





import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAtrributes {

	@Test(expectedExceptions = { NoSuchElementException.class})
	public void Timeout() {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		   driver.findElement(By.id("avks")).click();
		   driver.quit();
		   
	}
}
