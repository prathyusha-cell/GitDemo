package hello;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException, IOException  {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://altoconvertwordtopdf.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='dropzoneInput-label']")).click();
		
		Runtime.getRuntime().exec("C:\\testing\\fileupload.exe");
		
	}

}
