package hello;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		takeScreenshot("Facebook_LoginPage");

	}
public static void takeScreenshot(String fileName) {

	TakesScreenshot driver = null;
	//take screenshot and store it as a fileform
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy the screenshot to desired location
	
}
}
