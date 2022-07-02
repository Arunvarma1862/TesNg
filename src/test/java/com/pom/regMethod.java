package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class regMethod {
	
	static WebDriver driver;
	@Parameters("Browser" )
	@BeforeTest
	public void webLaunch(@Optional("chrome") String browserName)
	{
		switch(browserName.toLowerCase()) {
		case "chrome":
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		         break;
		case "edge":
			    WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();
			    driver.manage().window().maximize();
			    break;
	     default:
				 System.out.println("invalid broswer");
				 break;
		} 
	}
	@Parameters("sleepdown")
	@AfterTest
	public void TearDown(long sleepdown) throws Exception {
		Thread.sleep(sleepdown);
		driver.quit();
	}
	
	@Parameters( "url")
	@Test
	public void urll(String url) {
		driver.get(url);
	}


	@Test
	
	public void verifyRegister() {
		
	
		 regObject ro = new regObject(driver);
		 
	//     driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		 
	     ro.first("virat");
		 ro.last("kohil");	
		 ro.feme();
		 ro.meme();
		 ro.lang();
		 ro.emem("viratkohil1234");
		 ro.pass("pass1234");
		 ro.rege();
		 
		 
		 String texted= driver.findElement(By.xpath("//label[text()='Registration is Successful']")).getText();
		 System.out.println(texted);
		 
		 if(driver.getPageSource().contains("Registration is Successful")) {
			 
			 System.out.println("success");
		 }
			 else
				 
				 System.out.println("succ");
		 
	}
	@Test
	public void status() {
		 SoftAssert sa= new SoftAssert();
		 String expResult="Registration is Successfullllllllll";
		 String actResult=driver.findElement(By.xpath("//label[text()='Registration is Successful']")).getText();
	    sa.assertEquals(expResult, actResult,"test is mismatched");
		 sa.assertAll();
		 
	}
	
		
		 
	

	 
}
