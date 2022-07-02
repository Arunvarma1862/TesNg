package com.dataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataTest3 {
	@Test(dataProvider = "dp1")
	public void Login(String []s) throws Exception {

			 System.out.println(s[0]+">>>"+s[1]);
		//	 System.out.println(username+">>>>"+password);

	/*	for (Object strin : s) 
		   {
			System.out.print(strin);
		   }
		    System.out.println(">>>>");*/

	}
	@DataProvider
    public Object[][] dp1(){
		Object[][] data= new Object[][]{{"sfvsfsj","sfdfkdbfjk","afhfgjs"},
				                     {"jksjkbfjd","hsdbbv"}
		
		
		};
				            
		return data;
		}
	
}
