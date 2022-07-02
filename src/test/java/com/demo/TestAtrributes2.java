package com.demo;








import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAtrributes2 {

	@Test(invocationCount = 4,invocationTimeOut = 5000, threadPoolSize = 2)
	public void Testing() throws Exception {
		
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   
		   driver.get("https://randomuser.me/");
		   Thread.sleep(2000);
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
	
		   wait.until(d->d.findElement(By.xpath("//li[@data-label='name']")).isDisplayed());
		   driver.findElement(By.xpath("//li[@data-label='name']")).click();
		   System.out.println("username  "+driver.findElement(By.xpath("//li[@data-label='name']")).getAttribute("data-value"));
		
		   driver.findElement(By.xpath("//li[@data-label='email']")).click();
		   System.out.println("email "+ driver.findElement(By.xpath("//li[@data-label='email']")).getAttribute("data-value"));
		   
		   
		   driver.findElement(By.xpath("//li[@data-label='birthday']")).click();
		   System.out.println("birthday" + driver.findElement(By.xpath("//li[@data-label='birthday']")).getAttribute("data-value"));
	
		   driver.quit();
		
		   
	}
}
