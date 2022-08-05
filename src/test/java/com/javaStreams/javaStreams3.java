package com.javaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaStreams3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// hello world

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		
		
	List<WebElement>items=	driver.findElements(By.xpath("//tr//td[1]"));
	
	// 1 result
	
     List<WebElement> veg=	items.stream().filter(Veggie->Veggie.getText().contains("Rice")).collect(Collectors.toList());

     //1 result
   Assert.assertEquals(items, veg);
   Assert.assertTrue(items.equals(veg));
   Assert.assertEquals(items.size(), veg.size());
   
   System.out.println("success");
   
   
   
   driver.quit();
	}
	
	

}
