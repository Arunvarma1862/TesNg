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
	@Test(timeOut = 2000)
	public void st() throws Exception   {
		try {
		//	Thread.sleep(2600);
			int a=8/0;
		} catch (Exception e) {
		
		   throw new Exception("timeout exception dude");
			
		}
		
		
	}
	@Test(invocationCount = 6,invocationTimeOut = 2000)
	public void stst() throws InterruptedException {
		Thread.sleep(2900);
     	System.out.println("hello due");
     	
	}
	public static void main(String[] args) {
		String s4="105.54.85";
	    String s5=s4.substring(0,s4.indexOf("."));
	    System.out.println(s5);
	}
}
