package DataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_PropertyFile {

	public static void main(String[] args) throws Throwable {
		
		//creating an object for properties
		Properties p = new Properties();
		
		//creating an object for physical file
		FileInputStream  fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		//loading this fis
		p.load(fis);
		
		//reading data from property file
		String URL = p.getProperty("url");
		String userName = p.getProperty("username");
		String password = p.getProperty("password");
		
		//take care of driver executable
		WebDriverManager.chromedriver().setup();
				
		//open empty browser
		WebDriver driver = new ChromeDriver();	
				
		//maximize the window
		driver.manage().window().maximize();
		

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		
				

	}

}
