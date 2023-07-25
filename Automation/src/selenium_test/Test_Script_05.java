package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Test_Script_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// verify un and pwd field is visible or not
		WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		boolean status1 = un.isDisplayed();
		
		Thread.sleep(1000);
		if(status1) {
			System.out.println("username field is visible");
		}else {
			System.out.println("username field is not visible");
		}
		
		// 2
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		boolean status2 = un.isDisplayed();
		
		Thread.sleep(1000);
		if(status2) {
			System.out.println("password field is visible");
		}else {
			System.out.println("password field is not visible");
		}
		Thread.sleep(2000);
		
		// colorcode of login button
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	   String color = login.getCssValue("background-color");
	   System.out.println(color);
	   String c = Color.fromString(color).asHex();
	   System.out.println("Login button color is: "+c);
	   
	  if(c.equals("#ff7b1d")) {
		  System.out.println("verification of login button is successful");
	  }else {
		  System.out.println("verificatio of login button is not successful");
	  }
	  Thread.sleep(2000);
	  
	  // click on login button
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  WebElement msg = driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]"));
	  String msgString = msg.getText();
	  
	  System.out.println(msgString);
	  
	  
	  
	  
		
	}

}
