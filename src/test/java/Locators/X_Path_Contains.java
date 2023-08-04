package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path_Contains {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("anish");	
		driver.findElement(By.xpath("//input[contains(text,'Forgotten password?')]")).click();	
		Thread.sleep(5000);
		driver.close();
	}

}
