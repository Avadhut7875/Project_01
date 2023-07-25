package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Script_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// select pune
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("pune");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		
		// select chennai
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("chennai");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		
		// select date 
		driver.findElement(By.xpath("//div[@aria-label='Mon Feb 06 2023']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[normalize-space()='Done']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Done')]")).click();
		Thread.sleep(1500);
		
		//click on search flights
		driver.findElement(By.xpath("//span[@class='sc-XxNYO hiLeUc']")).click();
		Thread.sleep(1500);
		
		// list interface
		List<WebElement> time = driver.findElements(By.xpath("//span[@class='srp-card-uistyles__Time-sc-3flq99-15 kmJJId padT10 fb']"));
		List<WebElement> cost = driver.findElements(By.xpath("//span[@class='srp-card-uistyles__Time-sc-3flq99-15 kmJJId padT10 fb']//ancestor::div[@class=\"srp-card-uistyles__CardWrap-sc-3flq99-7 bIDWDp width100 dF\"]//child::div[@class=\"srp-card-uistyles__Price-sc-3flq99-17 vWbaF alignItemsCenter dF fb lh1 padT5\"]"));
		Thread.sleep(2000);
		//print departure time with cost
		for(int i=0;i<time.size();i++) {
			String t = time.get(i).getText();
			String c = cost.get(i).getText();
			
			System.out.println("Departure time: "+t+" cost of flight : "+c);
		}

	}

}
