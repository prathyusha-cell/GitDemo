package Testng;

import org.testng.annotations.Test;

public class testng2 {
	@Test(groups= {"Smoke"})
	public void smoke2() {
		System.out.println("smoke testing2");
	}
	@Test
	public void demo2() {
		System.out.println("hello1");
	}

}
