package testng;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Script_01 {
	
	@BeforeClass
	@Test(priority = 1, groups = "Functional")
	public void aTest() {
		Reporter.log("This is method a",true);
	}
	
	@Test(priority = 3 , dependsOnMethods = "aTest", groups = "Regression")
	public void bTest() {
		Reporter.log("This is method b",true);
	}
	
	@Test(priority = 2, groups = "Functional")
	public void cTest() {
		Reporter.log("This is method c",true);
	}
	
	@Test(priority = 4, groups = {"Functional","Regression"})
	public void dTest() {
		Reporter.log("This is method d",true);
		throw new SkipException("Skipped on purpose");
	}
	
	@Test(priority = 5, dependsOnMethods = "dTest", alwaysRun = true)
	public void eTest() {
		Reporter.log("This is method e",true);
	}

}
