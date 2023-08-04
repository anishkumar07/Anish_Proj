package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar_1 {

	public static void main(String[] args) throws Throwable {
		
		//take care of driver executable
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		//address of career
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		//x and y coordinates
		Point point = career.getLocation();
		int x=point.getX();
		int y=point.getY();
		//down casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(4000);
		//click action on career
		career.click();
		Thread.sleep(4000);
		driver.close();

	}

	
}
