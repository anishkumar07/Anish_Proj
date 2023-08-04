package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_SendKeys {

	public static void main(String[] args) throws Throwable {
		       //take care of driver executable
				WebDriverManager.chromedriver().setup();
				
				//open empty browser
				WebDriver driver = new ChromeDriver();	
				
				//maximize the window
				driver.manage().window().maximize();
				
		
				//enter and open url
				driver.get("https://www.foundit.in/");
				
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				
				//uploading through sendkeys
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\Anish Kumar_Resume.docx");
				Thread.sleep(2000);
				driver.quit();
				
				
				
				
	}

}
