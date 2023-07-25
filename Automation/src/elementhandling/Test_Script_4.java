package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Script_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		boolean status = email.isEnabled();
		
		if(status) {
			System.out.println("Enabled");
		} else {
			System.out.println("disabled");
		}
	}

}
