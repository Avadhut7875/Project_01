package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Script_CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///F:/VS%20code/FrontEnd/index2.html");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");

	}

}
