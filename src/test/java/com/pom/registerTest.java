package com.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registerTest {

	@Test
	public void verifyFlightReg() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		registerPage rp= new registerPage(driver);
		

		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		rp.clickRegLink();
		rp.setFirstName("vijay");
		rp.setLastName("kumar");
		rp.Phone("1234567890");
		rp.userName("viru");
		rp.Address("abcd");
		rp.City("vi");
		rp.State("ap");
		rp.PostalCode("456654");
		rp.con("INDIA");
		rp.Email("akj@gjsnl");
		rp.Password("1231");
		rp.confirmPassword("1231");
		rp.button();
		
		if(driver.getPageSource().contains("Thank you for registering")) 
		{
			System.out.println("your register success");
		}
		else
		{
			System.out.println("your register not success");
		}
		driver.close();
		
	}
}
