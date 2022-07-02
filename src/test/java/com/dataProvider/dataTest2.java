package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTest2 {
   @Test(dataProvider = "loginData")
   public void Login(String url) throws Exception
       {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get(url);
	   
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	   Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	   Thread.sleep(2000);
	   driver.quit();
	   
   }
   @DataProvider
   public Object[] loginData() {
	   Object[] data=new Object[2];
        data[0]="https://opensource-demo.orangehrmlive.com/";
        data[1]="https://opensource-demo.orangehrmlive.comm/";
	   return data;
   }
}
