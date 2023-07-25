package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Script_13 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// provide username
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		Select dropDayDown = new Select( driver.findElement(By.id("day")));
		dropDayDown.selectByVisibleText("22");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_3_5_yM']")).click();
		
		
	}

}
