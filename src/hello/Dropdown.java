package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(3000);
		 WebElement day = driver.findElement(By.id("Day"));
		 Select dropdown = new Select(day);
		 dropdown.selectByVisibleText("21");
		 Thread.sleep(2000);
		 WebElement month = driver.findElement(By.id("month"));
		 Select dropdown1 = new Select(month);
		 dropdown1.selectByVisibleText("Sept");
		 Thread.sleep(2000);
		 WebElement  year = driver.findElement(By.id("year"));
		 Select dropdown2 = new Select(year);
		 dropdown2.selectByVisibleText("1996");
		 
		
		
		
    
		
		
	}

}