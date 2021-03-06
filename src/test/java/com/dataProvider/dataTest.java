package com.dataProvider;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTest {
   @Test(dataProvider = "login details")
   public void Login(String username,String password) throws Exception {
		
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
	   driver.findElement(By.id("txtPassword")).sendKeys(password);
	   driver.findElement(By.id("btnLogin")).click();
	   assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	   Thread.sleep(2000);
	   driver.quit();
	   
   }
   @DataProvider(name="login details")
   public Object[][] loginData() {
	   
	  /* Object[][] data=new Object[2][2];
       data[0][0]="Admin";
       data[0][1]="admin123";
       
       data[1][0]="Admin";
       data[1][1]="test123";*/
	   
	   Object[][] data= new Object[][] {{"Admin","admin123"},{"Admin","test123"}};
       
	   return data;
   }
}
