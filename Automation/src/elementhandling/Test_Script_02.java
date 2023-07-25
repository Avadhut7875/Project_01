package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// click on create account button
		driver.findElement(By.linkText("Create new account")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		// select gender
	  WebElement gender = driver.findElement(By.name("sex"));
	  gender.click();
	  boolean status = gender.isSelected();
	  if(status) {
		  System.out.println("selected");
	  }else {
		System.out.println("not selected");
	}
	  
	  Thread.sleep(4000);
	  
	  WebElement male = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	 
	  male.click();
	 Thread.sleep(2000);
	  
	 
	  if(status) {
		  System.out.println("selected");
	  }else {
		System.out.println("not selected");
		
		
	}
	  
}

}
