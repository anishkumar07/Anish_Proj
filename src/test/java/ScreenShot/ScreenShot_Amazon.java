package ScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		//Typecasting
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//we access the method and store it in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// I have specify the location
		File dest= new File("./Screen-Shots/amazon.png");
		
		//copy paste from RAM to required location
		FileUtils.copyFile(src, dest);
		
		driver.close();
		

	}

}
