package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_06 {

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
	        // click on users
	        driver.findElement(By.xpath("//a[@class='content users']")).click();
	        Thread.sleep(1500);
	        // click on new user
	        driver.findElement(By.xpath("//div[contains(text(),'New User')]")).click();
	        Thread.sleep(1500);
	        // provide name
	        driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("avadhut");
	        Thread.sleep(1500);
	        // provide last name 
	        driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("mane");
	        Thread.sleep(1500);
	        // provide email
	        driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("avadhut7875@gmail.com");
	        Thread.sleep(1500);
	        // click on send button
	        driver.findElement(By.xpath("//div[contains(text(),'Save & Send Invitation')]")).click();
	        

}
}
