package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        // login
	        driver.findElement(By.id("username")).sendKeys("admin");
	        Thread.sleep(2000);
	        driver.findElement(By.name("pwd")).sendKeys("manager");
	        Thread.sleep(2000);
	        // select checkbox
	        driver.findElement(By.id("keepLoggedInCheckBox")).click();
	        Thread.sleep(2000);
	        // login button
	        driver.findElement(By.id("loginButton")).click();
	        Thread.sleep(2000);
	        // click on recent task
	        driver.findElement(By.xpath("//span[contains(text(),'Add Recent Task')]")).click();
	        Thread.sleep(2000);
	        // select any task
	        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[2]/div[3]")).click();
	        Thread.sleep(2000);
	        // verify
	        WebElement successmsg = driver.findElement(By.xpath("//span[contains(text(),'Task was successfully added to the Enter Time-Trac')]"));
	        boolean status = successmsg.isDisplayed();
	        
	        if(status) {
	        	System.out.println("task added successfully");
	        }else {
	        	System.out.println("task not added");
	        }
	}

}
