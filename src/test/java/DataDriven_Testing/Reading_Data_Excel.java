package DataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Data_Excel {

	public static void main(String[] args) throws Throwable {
		// creating an object for physical file
		FileInputStream  fis= new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		//called create method to hold fis
		Workbook wb = WorkbookFactory.create(fis);
		//reading data from the particular cell
		String URL = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		String title = driver.getTitle();
		
		//writing data into the Excel sheet
		wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
		//creating an object for file output stream
		FileOutputStream fos= new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\TestData.xlsx");
		wb.write(fos);

	}

}
