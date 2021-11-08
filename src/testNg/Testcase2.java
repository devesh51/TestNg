package testNg;

import org.testng.annotations.Test;

public class Testcase2 extends BaseClass{
	
	/*
	@Test
	public void creditcardTest() {
		
		System.out.println("Inside creditcard test");
	}
	*/
	@Test(groups= {"sanity"})
	public void creditcardTest() {
		
		System.out.println("Inside creditcard test");
	}


}
