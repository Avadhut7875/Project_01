package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// select mens selection
		driver.findElement(By.xpath("//span[contains(text(),\"Men's Fashion\")]")).click();
		Thread.sleep(1000);
		// select footwear
		driver.findElement(By.xpath("(//span[contains(@class,'headingText')][normalize-space()='Footwear'])[1]")).click();
		Thread.sleep(2000);
		// select footwear
		driver.get("https://www.snapdeal.com/product/urbanmark-gray-mens-massage-flip/5764608152124174932#bcrumbLabelId:18");
		Thread.sleep(2000);
		// add to cart
		driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
		Thread.sleep(2000);
		// verify
		WebElement msg = driver.findElement(By.xpath("//span[contains(text(),'UrbanMark Men Comfortable Contrast Strap Embossed ')]"));
		boolean status = msg.isDisplayed();
		Thread.sleep(2000);
		
		if(status) {
			System.out.println("msg displayed");
		}else {
			System.out.println("msg not displayed");
		}

	}

}
