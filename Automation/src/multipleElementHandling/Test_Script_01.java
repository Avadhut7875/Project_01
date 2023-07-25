package multipleElementHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		// Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 14");
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		 Thread.sleep(2000);
		
		// count no of products
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[contains(text(),'APPLE iPhone 14 (')]"));
		int count = products.size();
		
		System.out.println("No of products for iphone 14 are : "+count);
		System.out.println("*******************************************");
		// Thread.sleep(3000);
		
		// to find price
		List<Integer> data = new ArrayList<>(); 
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[contains(text(),'APPLE iPhone 14 (')]/../..//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for(int i=0;i<price.size();i++) {
			String str = price.get(i).getText().substring(1).replaceAll(",", "");
			int priceOfProduct = Integer.parseInt(str);
			data.add(priceOfProduct);
			
		}
		
	    // print each model name and price
		for(int i=0; i<count;i++) {
			WebElement phone = products.get(i);
			String modelName = phone.getText();
			
			int  p = data.get(i);
			
	
			System.out.println("Model name is : "+modelName+" "+"Price Name is : "+p+ " Rs");
		}
		
		Collections.sort(data);
		System.out.println("Lowest iphone 14 price is : "+data.get(0)+" Rs");
		System.out.println("Highest iphone 14 price is : "+data.get(data.size()-1)+" Rs");
	}

}
