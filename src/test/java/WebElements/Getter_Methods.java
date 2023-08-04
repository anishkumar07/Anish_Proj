package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Methods {

	public static void main(String[] args) throws Throwable {
		//take care of driver executable
				WebDriverManager.chromedriver().setup();
				//open empty browser
				WebDriver driver= new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//enters the url
				driver.get("https://www.facebook.com/");
				WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
				Point loc = password.getLocation();
				System.out.println("The x and y co ordinates of password textfield are as below");
				System.out.println(loc.getX());
				System.out.println(loc.getY());
				Thread.sleep(5000);
				System.out.println("The size and width of password textfield are as below");
				Dimension size = password.getSize();
				System.out.println(size.getHeight());
				System.out.println(size.getWidth());
				

	}

}
