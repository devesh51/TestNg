package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {


	@BeforeTest
	public void BeforTestMethod() {
		System.out.println("Inside Berfore Test Method");
	}
	@BeforeClass
	public void BeforClassM() {
		System.out.println("inside before class");
	}
	
	@BeforeMethod(alwaysRun=true) //always execute
	public void setup() {
		System.out.println("inside setup");
	}
 
	@AfterMethod (alwaysRun=true) //always execute 
	public void teardown() {
		System.out.println("inside teardown");

	}
	@AfterClass
	public void AfterClassM() {
		System.out.println("inside After Class");
	}
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("Inside After Test Method");
	}
	

}
