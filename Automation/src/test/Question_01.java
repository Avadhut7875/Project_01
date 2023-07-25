package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.youtube.com/premium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// search any one video
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
		// click on any one video
		driver.findElement(By.xpath("//div[@id='text-container']//a[@id='endpoint']")).click();
		Thread.sleep(10000);
		
		// print each video text as output
		List<WebElement> names = driver.findElements(By.xpath("//span[@id='video-title']"));
		List<WebElement> views = driver.findElements(By.xpath("//span[@id='video-title']/../..//span[@class=\"inline-metadata-item style-scope ytd-video-meta-block\"][1]"));
		
		Thread.sleep(2000);
		
		for(int i=0;i<views.size();i++) {
			String n = names.get(i).getText();
			String v = views.get(i).getText();
			
			System.out.println("Video Title is : "+n+" Views Are : "+v);
		}
		
		Thread.sleep(2000);
		
		// click on any one video
		names.get(2).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
