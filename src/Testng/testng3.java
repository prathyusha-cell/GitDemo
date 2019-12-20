package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng3 {
	@AfterMethod
	public void aftermthd() {
		System.out.println("it will execute after all methods 8 ");
	}
	@Parameters({"URL"})
	@Test
	public void Weblogincarloan(String uname) {
		System.out.println("carloan 4");
		System.out.println("uname");
	}
	@Test(groups= {"Smoke"})
	public void smoke3() {
		System.out.println("smoketesting 3");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("it will execute after suite 1");
	}
	@Test
	public void Mobileloginhomeloan() {
		System.out.println("homeloan 5");
	}
	@BeforeClass
	public void cls() {
		System.out.println("it will execute before all the classes");
	}
	@BeforeMethod
	public void beforemthd() {
		System.out.println("it will excute before methods 2");
	}
	@AfterClass
	public void cls2() {
		System.out.println("it will execute after all the classes");
	}
	@BeforeTest
	public void first() {
		System.out.println("first execution 3");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("it will execute before the suite 1");
	}
	@Test
	public void Mobilesignouthomeloan() {
		System.out.println("homeloan 6");
	}
	@Test
	public void APIloginpersonalloan() {
		System.out.println("personalloan 7");
	}
	

}
