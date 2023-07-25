package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Script_12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		// enter un
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		// enter pwd
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		// select check box
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		// login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
