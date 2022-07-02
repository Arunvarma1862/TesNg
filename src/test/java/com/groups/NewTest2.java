package com.groups;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups= "all")
public class NewTest2 {
  
  @Test
  public void test4() {
	  System.out.println("test4");
  }
  @Test(groups= {"functional","sanity"})
  public void test5() {
	  System.out.println("test5");
  }

  @Test(groups= {"regression"})
  public void test6() {
	  System.out.println("test6");
  }
  @Test(groups= {"smoke","sanity","functional"})
  public void test7() {
	  System.out.println("test7");
  }
  @Test(groups= {"adhoc","sanity","functional"})
  public void test8() {
	  System.out.println("test8");
  }
}
