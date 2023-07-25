package javaScriptExecutor;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		for(int i=0;i<5;i++) {
			je.executeScript("window.scrollBy(0,500)");
		}
		
		for(int i=0;i<5;i++) {
			je.executeScript("window.scrollBy(0,-500)");
		}
		
		

	}

}
