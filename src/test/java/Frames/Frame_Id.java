package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Id {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a= new Actions(driver);
		a.moveToElement(signin).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("anish");
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[text()='login']\")).click();")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("1234");
        driver.close();
	}

}
