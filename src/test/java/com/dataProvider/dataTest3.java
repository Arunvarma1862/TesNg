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

			 System.out.println(s[0]+">>>"+s[1]+">>>"+s[2]);
		//	 System.out.println(username+">>>>"+password);

	/*	for (Object strin : s) 
		   {
			System.out.print(strin);
		   }
		    System.out.println(">>>>");*/

	}
	@DataProvider
    public Object[][] dp1(){
		
		Object[][] data= new Object[2][3];
		data[0][0]="sfvsfsj";
		data[0][1]="sfdfkdbfjk";
		data[0][2]="afhfgjs";
		data[1][0]="jksjkbfjd";
		data[1][1]="hsdbbv";
		
		
		/*Object[][] data= new Object[][]{{"sfvsfsj","sfdfkdbfjk","afhfgjs"},
				                     {"jksjkbfjd","hsdbbv"}
		
		
		};*/
				            
		return data;
		}
	
}
