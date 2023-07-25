package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jExecutor = (JavascriptExecutor)driver;
//		jExecutor.executeScript("document.getElementById('email').value='ava@gamil.com'");
		jExecutor.executeScript("document.getElementById('email').setAttribute('value','av@gamil.com')");

	}

}
