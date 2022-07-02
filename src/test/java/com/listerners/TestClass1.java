package com.listerners;



import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testListerners.class)
public class TestClass1 {

	@Test

	public void TestMethod1() {
		System.out.println("im inside test method1");
	}
	
	@Test

	public void TestMethod2() {
		System.out.println("im inside test method2");
		assertTrue(false);
	}
	
	@Test(timeOut=1000)

	public void TestMethod3() throws Exception {
		Thread.sleep(2000);
		System.out.println("im inside test method3");
	}
	
	
	@Test(dependsOnMethods ="TestMethod3" )

	public void TestMethod4() {
		System.out.println("im inside test method4");
	}
}
