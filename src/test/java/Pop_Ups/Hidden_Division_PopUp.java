package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_PopUp {

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
				driver.get("https://www.redbus.com/");
				
				driver.findElement(By.xpath("//div[@id='date-box']")).click();
				
				Thread.sleep(5000);
				
				//selecting date from calender
				driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz']/../..//span[text()='26']")).click();
	            
				Thread.sleep(5000);
	            driver.close();
				
				
				
				
	}

}
