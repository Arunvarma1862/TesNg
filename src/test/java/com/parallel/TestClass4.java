package com.parallel;

import org.testng.annotations.Test;

public class TestClass4 {

	@Test

	public void TestMethod12() {
		System.out.println("TestClass1 >>>>> TestMethod12 >> "+ Thread.currentThread().getId());
	}
	@Test

	public void TestMethod13() {
		System.out.println("TestClass1 >>>>> TestMethod13 >> "+ Thread.currentThread().getId());
	}
	@Test

	public void TestMethod14() {
		System.out.println("TestClass1 >>>>> TestMethod14 >> "+ Thread.currentThread().getId());
	}
	@Test

	public void TestMethod15() {
		System.out.println("TestClass1 >>>>> TestMethod15 >> "+ Thread.currentThread().getId());
	}
}
