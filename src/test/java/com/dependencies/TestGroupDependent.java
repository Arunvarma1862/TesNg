package com.dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestGroupDependent {
	
	
  @Test(groups = "smoke")
  public void Test1() {
	  System.out.println("smoke");
  }
  
  @Test(groups = "smoke")
  public void Test7() {
	  System.out.println("smoke");
  }
  
  @Test(groups = "smoke")
  public void Test2() {
	  System.out.println("smoke");
	//  System.out.println(5/0);
  }
  @Test(groups = "sanity")
  public void Test3() {
	  System.out.println("sanity");
  }
  @Test(groups = "sanity")
  public void Test4() {
	  System.out.println("sanity");
  }
  
  @Test(groups = "regression")
  public void Test5() {
	  System.out.println("regression");
  }

  @Test(groups = "regression")
  public void Test6() {
	  System.out.println("regression");
	//  System.out.println(5/0);
  }
  
  
  @Test(dependsOnGroups ={"smoke","sanity","regression"} )
  public void Test8()
   {
	  System.out.println("main test");
  }

}
