package com.demo_01;

import org.testng.annotations.DataProvider;

public class DataProviderConcept {
	@DataProvider(name="LoginData")
	public static Object[][] test(){
		return new Object[][] {
			{"Sundram1","Test1"},
			{"Sundram2","Test2"},
			{"Sundram3","Test3"},
			{"Sundram4","Test4"}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();

	}

}
