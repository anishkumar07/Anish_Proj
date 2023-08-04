package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verfication_Methods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		if(text.isDisplayed())
		{
		   
			System.out.println("Pass");
			text.sendKeys("samsung mobile");
		
		
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
	}

}
