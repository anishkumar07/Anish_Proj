package Assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2 {

	public static void main(String[] args) throws Throwable {
		
		//take care of driver executable
		WebDriverManager.chromedriver().setup();
		
		//open empty browser
		WebDriver driver = new ChromeDriver();	
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter and open url
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		
		//switch to frame1
		driver.switchTo().frame("packageListFrame");
		
		//fetching address
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		
		//Back the control
		driver.switchTo().defaultContent();
		
		//switch to frame2
		driver.switchTo().frame("packageFrame");
		
		//fetching address
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		
		//Back the control
		driver.switchTo().defaultContent();
		
		//switch to frame3
		driver.switchTo().frame("classFrame");
				
		//fetching address
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
		Thread.sleep(5000);
		
		//close the application
		driver.close();
				
		
		
		
		
		
		
	}

}
