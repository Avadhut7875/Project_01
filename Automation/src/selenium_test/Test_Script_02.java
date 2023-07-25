package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// click on departure
	  WebElement date = driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]"));
      boolean status = date.isEnabled();
      
      // verification
      if(status) {
    	  System.out.println("Enabled");
      }else {
		System.out.println("Element disabled");
	}

	}

}
