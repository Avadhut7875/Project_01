package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('username').value='admin';");
//		js.executeScript("document.getElementsByName('pwd')[0].value='manager';");
//		
//		js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=true;");
//		
//		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
//		js.executeScript("arguments[0].click();", loginBtn);
		
//		driver.quit();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 14");
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		
		WebElement tgt = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 256 GB)']"));
		
		js.executeScript("arguments[0].scrollIntoView();", tgt);
		
		

	}

}
