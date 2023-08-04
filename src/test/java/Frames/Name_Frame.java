package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Frame {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement sign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(sign).perform();
	    driver.findElement(By.xpath("//a[text()='login']")).click();
	    driver.switchTo().frame("iframeLogin");
	    driver.findElement(By.xpath("//input[@class='col-xs-24']")).sendKeys("anish");
	    driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("kumar");
	    driver.close();
	
		
	}
	


}
