package com.dataProvider;


import org.testng.annotations.Test;



public class dataTest6 {
	@Test(dataProvider = "dp1", dataProviderClass = dataSupplier.class)
   public void Login(String s) throws Exception {
	System.out.println(s);
	   
   }
  
}
