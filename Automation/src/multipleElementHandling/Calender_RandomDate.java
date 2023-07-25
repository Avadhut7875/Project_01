package multipleElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_RandomDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		String target_month = "Dec 2023";
		
		while (true) {
			Thread.sleep(1000);
			
			String actual_month = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			if(actual_month.equals(target_month)) {
				break;
			}else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		}
		Thread.sleep(3000);
		
		String target_date = "5";
		
	driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td[text()='"+target_date+"']")).click();
	}

}
