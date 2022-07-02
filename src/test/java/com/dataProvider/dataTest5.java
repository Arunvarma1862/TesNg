package com.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataTest5 {
	@Test(dataProvider = "loginData")
   public void Login(String s) throws Exception {
	System.out.println(s);
	System.out.println(s.length());
	   
   }
   @DataProvider(indices = {0,2})
   public String[] loginData()
   {
    String[]data= new String[] {"abcd","egkkl","dhhh","tdghdh"

   };
  return data;
   }
}
