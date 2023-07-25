package selWithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Script_02 {
	
	@DataProvider
	public Object[][] testData(){
		Object[][] rv = new Object[1][2];
		rv[0][0]="admin@gmail.com";
		rv[0][1]="admin@123";
		
		return rv;
	}
	
	@Test(dataProvider = "testData")
	public void testFacebookLogin(String emailId, String pwd) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}

}
