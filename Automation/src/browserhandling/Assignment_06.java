package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.spicejet.com/");
          driver.manage().window().maximize();
          Thread.sleep(2000);
       // click on login button
          driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
          Thread.sleep(1500);
       // click on sign up page
          driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).click();
          Thread.sleep(2000);
       // enter details
          driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/select[1]")).click();
          Thread.sleep(1500);
          driver.findElement(By.xpath("//option[normalize-space()='Mr']")).click();
          
       
	}

}
