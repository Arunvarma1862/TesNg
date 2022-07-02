package com.capturescreenshots;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;



public class TestClass extends Basetest{
  
    
	@Test(testName="TestGoogle",groups= {"smoke"})
	public void TestGoogle() throws Exception {

		driver.get("https://www.google.com/");
		extentTest.info("navigate to url");
		driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
		extentTest.log(Status.INFO,"<b><i>entered text i serach box</i></b>");
		String ExpectedResult= "hello - Google Search";
		String actuaLresult=  driver.getTitle();
		assertEquals(actuaLresult,ExpectedResult,"title is mismatched");
		extentTest.pass("Assertion is passed for webpage text");
		System.out.println(driver.getTitle());
      
	}
	
	@Test(testName="TestFacebook",groups= {"smoke","regression"})
	public void TestFacebook() throws Exception 
	{


		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		extentTest.info(MarkupHelper.createLabel("navigate to url", ExtentColor.BLUE));
		driver.findElement(By.name("email")).sendKeys("arunbabu@",Keys.ENTER);
		extentTest.info(MarkupHelper.createLabel("crediatials enterded", ExtentColor.GREEN));
		Thread.sleep(2000);

		SoftAssert sa= new SoftAssert();
		
		// title assertion

		String actualTitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		sa.assertEquals(actualTitle, expectedtitle,"title is mismatched");

		// url Assertion

		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/";
		sa.assertNotEquals(actualURL, expectedURL,"URL is mismatched");


		//TextAssertion

		String actualText=driver.findElement(By.id("email")).getAttribute("value");
		String expectedText="";
		sa.assertEquals(actualText, expectedText,"text is mismatched");

		                              // ErrorMessage


		/* String actualmsge=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		 String expectedmsge="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		 sa.assertEquals(actualmsge, expectedmsge,"error msge is mismatched");*/
				    	
				    	
		sa.assertAll();
	}    

	@Test(testName="TestorangeHrm",groups= {"sanity"})
	public void TestorangeHrm() 
	{

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		extentTest.info("navigate to url");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin12345");
		driver.findElement(By.id("btnLogin")).click();

		Assert.assertTrue (driver.findElement(By.id("welcome")).isDisplayed());

	}
}
