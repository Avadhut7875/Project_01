package multipleElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Country {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.fatcow.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='countrySelect']"));
		dropDown.click();
		Thread.sleep(3000);
		Select select = new Select(dropDown);
		Thread.sleep(3000);
		select.selectByIndex(3);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
