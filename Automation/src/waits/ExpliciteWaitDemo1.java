package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
		
		// verify title
		wait.until(ExpectedConditions.titleContains("Facebook"));
		
		// verify url
		wait.until(ExpectedConditions.urlContains("face"));
		
		WebElement email = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("avadhut@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Avadhut");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
		
		
		

	}

}
