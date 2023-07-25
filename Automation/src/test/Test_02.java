package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// click on create account button
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		// enter first name
		driver.findElement(By.name("firstname")).sendKeys("Avadhut");
		Thread.sleep(1000);
		// enter last name
		driver.findElement(By.name("lastname")).sendKeys("Mane");
		Thread.sleep(1000);
		// enter email
		driver.findElement(By.name("reg_email__")).sendKeys("avadhut7875@gmail.com");
		Thread.sleep(1000);
		// re enter email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("avadhut7875@gmail.com");
		Thread.sleep(1000);
		// enter new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("avadhut@456");
		Thread.sleep(1000);
		// select day drop down
		Select dayDropDown = new Select(driver.findElement(By.id("day")));
		dayDropDown.selectByVisibleText("22");
		Thread.sleep(2000);
		// select month drop down
		Select monthDropDown = new Select(driver.findElement(By.id("month")));
		monthDropDown.selectByVisibleText("Feb");
		Thread.sleep(2000);
		// select year drop down
		Select yearDropDown = new Select(driver.findElement(By.id("year")));
		yearDropDown.selectByVisibleText("1999");
		Thread.sleep(2000);
		// select gender
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(1000);
		// click on sign up button
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
