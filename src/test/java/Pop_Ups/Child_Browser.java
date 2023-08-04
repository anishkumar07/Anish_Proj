package Pop_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser {

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
				driver.get("https://www.skillrary.com/");
				
			
				driver.findElement(By.xpath("//a[text()= ' GEARS ']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()=' SkillRary Essay']")).click();
				
				//shifting control to child browser
				Set<String> child = driver.getWindowHandles();
				for(String d:child)
				{
					driver.switchTo().window(d);
				}
				//handling child browser elements
				
				driver.findElement(By.id("mytext")).sendKeys("anish");
				
				String parent = driver.getWindowHandle();
				//shifting control to parent window
				driver.switchTo().window(parent);
				//Handling parent window
				driver.findElement(By.xpath("//a[text()='CATEGORIES'][2]")).click();
				
				Thread.sleep(5000);
				driver.quit();
				
				
				

	}

}
