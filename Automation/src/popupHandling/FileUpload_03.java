package popupHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_03 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn-wrapper upload-btn']")).click();
		Thread.sleep(2000);
		
		// AutoIT
		Runtime.getRuntime().exec("../Automation/autoIt/FileUpload_01.exe");
	}

}
