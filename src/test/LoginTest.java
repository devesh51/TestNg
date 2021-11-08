package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
		
		@Parameters({"Username" , "Password"})
		@Test
	    public void NegativeLogin(String UserName1, String PassWord) {
		
		test = report.startTest("Negative report test");
		LoginPage login = new LoginPage();	
		login.Login(UserName1 , PassWord);
		report.endTest(test);
		
		
		/*
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String Actualmsg= Error.getText();
		String Expmsg="The email or password you have entered is invalid.";
		
		
		// Assert.assertEquals(Actualmsg, Expmsg); 
		
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(Actualmsg, Expmsg);
		
		System.out.println("after assertion "); //if exception occur in the above line it doesn't executed
		System.out.println("after assertion ");
		System.out.println("after assertion ");
		System.out.println("after assertion ");
		soft.assertAll();
		
		*/
	}
		@Parameters({"Username" , "CorrectPassword"})
		@Test
	    public void PositiveLogin(String UserName1, String PassWord) {
			
			
			test = report.startTest("Positive report test");	
			LoginPage login = new LoginPage();
			login.Login(UserName1 , PassWord );
			report.endTest(test);
				

		}
		
}


