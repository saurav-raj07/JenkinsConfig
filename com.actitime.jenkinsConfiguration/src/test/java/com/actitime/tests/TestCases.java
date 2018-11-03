package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.LoginPage.LoginPage;
import com.actitime.baselib.BaseLib;

public class TestCases extends BaseLib {

	//WebDriver driver;

	@Test(invocationCount=10)
	public void logintest() throws InterruptedException {
		// System.out.println("hello");
		LoginPage lp = new LoginPage(driver);
		// System.out.println("hello2");
		lp.loginFunction("admin", "manager");
		// System.out.println("hello3");
	}

}
