package selWithTestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Script_04 extends BaseTest {
	
	@Test
	public void testFacebookLogin() {
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
	}

}
