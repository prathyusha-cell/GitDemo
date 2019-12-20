package hello;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertiesfile {

	public static void main(String[] args) throws Exception{
		FileReader reader = new FileReader("Datafile.properties");
		Properties prop = new Properties();
		prop.load(reader);
		String chromepath = prop.getProperty("chrome");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", chromepath);
		 driver = new ChromeDriver();
		
		

	}

}
