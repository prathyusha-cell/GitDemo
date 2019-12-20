package Testng;

import org.testng.annotations.Test;
 
public class testng4 {
	@Test
	public void Weblogincarloan() {
		System.out.println("web ");
	}
	@Test(enabled=false)
	public void mobilelogincarloan() {
		System.out.println(" mobile");
	}
	@Test(dependsOnMethods= {"Weblogincarloan"})
	public void APIlogincarloan() {
		System.out.println(" API");
	}
	@Test(timeOut=2000)
	public void chromelogincarloan() {
		System.out.println("chrome");
	}
}
