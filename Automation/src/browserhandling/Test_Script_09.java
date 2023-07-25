package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Script_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		// provide email and password
		driver.findElement(By.id("email")).sendKeys("avadhut");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("mane");
		Thread.sleep(3000);
		driver.close();

	}

}
