package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("anish");
		driver.findElement(By.id("pass")).sendKeys("kumar");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		//Hard Assert
		Assert.assertEquals(title, "xsdfg");
		//Soft Assert
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "xsdfg");
		String url=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
