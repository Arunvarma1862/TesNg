package com.javaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaStream2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// hello world

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column

		driver.findElement(By.xpath("//tr//th[1]")).click();

		// capture all webelements into list

		List<WebElement> list= driver.findElements(By.xpath("//tr//td[1]"));


		// capture text of all webelements into new(original)list

		List<String> originalList=	 list.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList.get(1));

		// sort on the originalListof step 3-> sorted list

	     List<String> sortedList=	originalList.stream().sorted().collect(Collectors.toList());
	     System.out.println(sortedList.get(3));
	
	  // compare originalList with sortedList
	     
	     Assert.assertTrue(originalList.equals(sortedList));
	}
}
