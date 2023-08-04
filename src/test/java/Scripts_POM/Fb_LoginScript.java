package Scripts_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Fb_Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_LoginScript {

	public static void main(String[] args) throws Throwable {
		
		//creating an object for properties
		Properties p = new Properties();
				
		//creating an object for physical file
		FileInputStream  fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
				
		//loading this fis
		p.load(fis);
				
		//reading data from property file
		String URL = p.getProperty("url");


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Fb_Login fb= new Fb_Login(driver);
		fb.emailTextField("anish");
		fb.passwordTextField("kumar");
		fb.loginButton();

	}

}
