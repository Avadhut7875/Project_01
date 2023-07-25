package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class ExcelSheet {
	
	@Test(dataProvider = "testData")
	public void test(String un, String pwd) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
		String expectedTitle = "(20+) Facebook";
		
		String actualTitle = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
		softAssert.assertAll();
	}
	
	
	@DataProvider
	public static Object[][] testData() throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\Excel\\Login.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
		
		 Sheet s = wb.getSheet("Sheet1");
		 
		 int rowNum = s.getLastRowNum();
		 System.out.println(rowNum);
		 short cellNum = s.getRow(0).getLastCellNum();
		 
		 Object [][] rv = new Object[rowNum-1][cellNum];
		 
		 for(int i=1;i<rowNum;i++) {
			 
			 Row r = s.getRow(i);
			 
			 for(int j=0;j<cellNum;j++) {
				 
				String data = r.getCell(j).toString();
				System.out.print(data+" ");
				rv[i-1][j]=data;
				
			 }
			 System.out.println();
		 }
		 wb.close();
		 file.close();
		 return rv;

	}

}
