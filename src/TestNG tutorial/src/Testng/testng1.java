package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testng1 {
	@Test
	public void Demo() {
		System.out.println("hello");
	}
	@AfterTest
	public void last() {
		System.out.println("last execution");
	}
	@Test(groups= {"Smoke"})
	public void smoketest() {
		System.out.println("smoke testing");
	}
	
		@Test
		public void secondtest() {
			System.out.println("bye");
	}

}
