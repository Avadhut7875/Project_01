package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
	WebElement errormsg = driver.findElement(By.xpath(".//span[@class='errormsg']"));
		boolean status = errormsg.isDisplayed();
		
		if(status) {
			System.out.println("Error msg displayed");
		}else {
			System.out.println("Error msg not displayed");
		}

	}

}
