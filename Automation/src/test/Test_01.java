package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
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
		Thread.sleep(2000);
		// select new button
		driver.findElement(By.xpath("//span[contains(text(),'New')]")).click();
		Thread.sleep(3000);
		// select dropdown
	   driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[4]")).click();
	   Thread.sleep(2000);
	   // select second drop down
	   driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[1]/div[3]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[2]/div/div[1]/div/div[2]")).click();
	   Thread.sleep(2000);
	   // enter task name
	   driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input")).sendKeys("Selenium");
	   Thread.sleep(2000);
	   // select create task button
	   driver.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
	   Thread.sleep(3000);
	   driver.quit();

	}

}
