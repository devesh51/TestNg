package testNg;


import org.testng.annotations.Test;

public class Testcase1 extends BaseClass {
	
	//why it cannot run 1st?
	/*
	@BeforeTest
	public void Befortest1() {
		System.out.println("Inside Berfore Test Method 1");
	}
	*/
	
	@Test(priority=2,description="this tast is showing home lone fuctionality") //priority=0 is the highest priority
	public void HomeloanTest1() {
		
		System.out.println("Inside Home Loan1");
	}
	
	@Test(priority=1,description="this tast is showing home lone fuctionality")
	public void HomeloanTest() {
		
		System.out.println("Inside Home Loan");
	}
	//@Test(enabled=true, description = "this tast case is showing car lone fuctionality")

	/*
	@Test(description = "this tast case is showing car lone fuctionality")
	public void CarloanTest() {
		System.out.println("Inside Car Loan");
		
	}
	*/
	@Test(priority=0,groups={"sanity"},description = "this tast case is showing car lone fuctionality")
	public void CarloanTest() {
		System.out.println("Inside Car Loan");
	}
	
	
}
