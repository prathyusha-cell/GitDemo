package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng5 {
	@Parameters({"URL","APIKey/Username"})
	@Test
	public void WebloginCarLoan(String uname,String Key) {
		System.out.println("Weblogincar");
		System.out.println("uname");
		System.out.println("Key");
	}
	@Test
	public void Mobileloginhomeloan() {
		System.out.println("homeloan 5");
		}
	@Test
	public void Mobilesignouthomeloan() {
		System.out.println("homeloan 6");
	}
	@Test(dataProvider = "getdata")
	public void APIloginpersonalloan(String username,String password) {
		System.out.println("personalloan 7"); 
		System.out.println("username");
		System.out.println("password");
	}
	@DataProvider
	public Object[][] getdata() {
		//1st combination-username password-good credit history
		//2nd combination-username password-good no credit history
		//3rd combination-username password-good fraudlent credit history
		//defining an multidymentional array
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]= "firstset username";
		data[0][1]= "first password";
		//2nd
		data[1][0]= "secondset username";
		data[1][1]= "second password";
		//3rd set
		data[2][0]= "thirdset username";
		data[2][1]= "third password";
		return data;
	}
}
