package com.capturescreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCsTest {
	
	public static WebDriver driver;
	public static String screenshotsubfolderName;
	 
	@BeforeTest
	public void setup() 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	/*@AfterMethod
	public void screen(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		 {
			   captureS( result.getTestContext().getName()+"_"+ result.getMethod().getMethodName()+".jpg");
		 }
		
	}
	
		
	@AfterTest
	public void teardown() {
		driver.quit();
	}*/
	
	
	public void captureS(String fileName)
	{
		if(screenshotsubfolderName == null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();


			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

			screenshotsubfolderName= myDateObj.format(myFormatObj);


		}


		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=	ts.getScreenshotAs(OutputType.FILE);
		File dst =   new File("./screenshot/"+screenshotsubfolderName+"/"+fileName);
		try
		{
			FileUtils.copyFile(src, dst);
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}
		System.out.println("screenshot saved succesfully");




	}

}
