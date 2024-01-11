package com.demo_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo02 {
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("This is inside Test 1");
	}

	@Test(dataProvider = "dp")
	public void g(Integer n,String s) {
		System.out.println("This is inside Test 2");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" } };
	}

}
