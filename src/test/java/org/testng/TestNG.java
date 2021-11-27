package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	private void tc01() {
		System.out.println("Before class : Test01");
	}

	@BeforeMethod
	private void tc02() {
		System.out.println("Before Method : Test02");
	}
	
	@Test
	private void tc03() {
		System.out.println("Test : Main");
	}
	
	@AfterMethod
	private void tc04() {
		System.out.println("After Method : Test04");
	}
	
	@AfterClass
	private void tc05() {
		System.out.println("After Class : Test05");
	}
}
