package multipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Script_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		// enter p in search field
		//driver.findElement(By.xpath("//span[@class='inline-flex leading-none Icon_sIcon__5F7YL transform']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='input-auto-complete']"));
		search.sendKeys("p");
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='cursor-pointer']"));
		int count = list.size();
		
		// print count as output
		System.out.println("options displayed are : "+count);
		
		// select pune
//		for(int i=0;i<count;i++) {
//			String opt = list.get(i).getText();
//			
//			if(opt.contains("Pune")) {
//				list.get(i).click();
//				break;
//			}else {
//				System.out.println("not present");
//			}
//		}
		
		// search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		// click on search
		driver.findElement(By.xpath("//span[@class='inline-flex leading-none transform text-grey-700']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		Thread.sleep(3000);
		WebElement loc = driver.findElement(By.xpath("//button[@name='location_filters']"));
		action.moveToElement(loc).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='w-full pl-3 pr-11 placeholder-grey-500']")).sendKeys("Hadpsar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Thread.sleep(3000);
		
		List<WebElement> name = driver.findElements(By.xpath("//button[@class='text-left w-full truncate font-bold']"));
		List<WebElement> price = driver.findElements(By.xpath("//button[@class='text-left w-full truncate font-bold']/ancestor::div[@class=\"flex flex-grow-1 justify-between accomodation-item_infoSection__jtzM6 flex-1\"]//div[@class=\"flex flex-col justify-between\"]"));
		
		for(int i=0;i<name.size();i++) {
			String n = name.get(i).getText();
			String p = price.get(i).getText();
			
			System.out.println("Hotel Name : "+n+" price : "+p);
		}
		
	}

}
