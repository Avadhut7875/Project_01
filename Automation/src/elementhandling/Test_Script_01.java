package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// enter un
	WebElement email =	driver.findElement(By.id("email"));
	email.sendKeys("admin");
		Thread.sleep(2000);
		String text ="admin";
		int length = text.length();
		System.out.println(length);
		Thread.sleep(3000);
		// remove entered text
		for(int i=5;i>=0;i--) {
			Thread.sleep(1000);
			
			email.sendKeys(Keys.BACK_SPACE);
			
		}
		
		
	}

}
