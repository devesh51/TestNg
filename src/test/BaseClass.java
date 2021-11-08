package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public void ReportSteup() {
		report = new ExtentReports("ExtentReport.html");
		
	}
	
	
	
	@BeforeMethod
	public void setup() {
		

	    driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();

		}
	
	@AfterTest
	public void ReportTearDown() {
		report.flush();
		report.close();
	}
	

}
