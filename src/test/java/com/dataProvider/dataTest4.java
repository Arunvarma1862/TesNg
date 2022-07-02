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

public class dataTest4 {
	@Test(dataProvider ="dp1" )
    public void login(String[] s) {
		System.out.println(s[0]+">>>>>"+s[1]);

	}
	@DataProvider
	public Iterator<String[]>  dp1() {

		List<String[]> data=new ArrayList<>();
		data.add(new String[]{"scvdj","ekdscbdhb","hfbjsdkj"});
		data.add(new String[]{"scvdj","ekbdhb"});
		return data.iterator();

	}

}
