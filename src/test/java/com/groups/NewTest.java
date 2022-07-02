package com.groups;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test
public class NewTest {
	
  @Test(groups= {"smoke","sanity"})
  public void test1() {
	  System.out.println("test1");
  }
  
  
  @Test(groups= {"smoke","regression"})
  public void test2() {
	  System.out.println("test2");
  }
  
  
  @Test(groups= {"functional","regression"})
  public void test3() {
	  System.out.println("test3");
  }
}
