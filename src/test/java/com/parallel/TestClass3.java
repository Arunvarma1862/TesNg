package com.parallel;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test

	public void TestMethod8() {
		System.out.println("TestClass1 >>>>> TestMethod8 >> "+ Thread.currentThread().getId());
	}
	@Test

	public void TestMethod9() {
		System.out.println("TestClass1 >>>>> TestMethod9 >> "+ Thread.currentThread().getId());
	}
	@Test

	public void TestMethod10() {
		System.out.println("TestClass1 >>>>> TestMethod10 >> "+ Thread.currentThread().getId());
	}
	@Test

	public void TestMethod11() {
		System.out.println("TestClass1 >>>>> TestMethod11 >> "+ Thread.currentThread().getId());
	}
}
