package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Script_08 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///F:/VS%20code/FrontEnd/index2.html");
		Thread.sleep(3000);
		
		// provide un and pwd
		driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");

	}

}
