		package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTest7 {
   @Test(dataProvider = "loginData")
   public void Login(String username,String password) throws Exception {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
	   driver.findElement(By.id("txtPassword")).sendKeys(password);
	   driver.findElement(By.id("btnLogin")).click();
	   Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	   Thread.sleep(2000);
	   driver.quit();
	   
   }
   @DataProvider(parallel= true)
   public Object[][] loginData() {
	   
	   Object[][] data=new Object[6][2];
       data[0][0]="Admin";
       data[0][1]="admin123";
       
       data[1][0]="Admin";
       data[1][1]="test123";
       
       data[2][0]="Admin";
       data[2][1]="test123";
       
       data[3][0]="Admin";
       data[3][1]="test123";
       
       data[4][0]="Admin";
       data[4][1]="test123";
       
       data[5][0]="Admin";
       data[5][1]="test123";
       
	   return data;
   }
}
