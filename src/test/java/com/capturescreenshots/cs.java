package com.capturescreenshots;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class cs extends BaseCsTest{
    @Parameters("url")
    
	@Test(testName="TestGoogle")
	public void TestGoogle(String url) throws Exception {

		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
		String ExpectedResult= "hello - Google Searchjj";
		String actuaLresult=  driver.getTitle();
		assertEquals(actuaLresult,ExpectedResult,"title is mismatched");
		System.out.println(driver.getTitle());

	}
	
	@Test(testName="TestFacebook")
	public void TestFacebook() throws Exception 
	{


		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		driver.findElement(By.name("email")).sendKeys("arunbabu@",Keys.ENTER);
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


		// String actualmsge=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		// String expectedmsge="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		// sa.assertEquals(actualmsge, expectedmsge,"error msge is mismatched");
		//		    	
		//		    	
		sa.assertAll();
	}    

	@Test(testName="TestorangeHrm")
	public void TestorangeHrm() 
	{

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		Assert.assertTrue (driver.findElement(By.id("welcome")).isDisplayed());

	}
}
