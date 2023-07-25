package popupHandling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("F:\\VS code\\Selenium\\fileUpload.html");
		driver.manage().window().maximize();
		
		WebElement tgt = driver.findElement(By.id("ele_01"));
		
		File file = new File("ScreenShots/first.png");
		Thread.sleep(2000);
		String path = file.getAbsolutePath();
		Thread.sleep(2000);
		tgt.sendKeys(path);

	}

}
