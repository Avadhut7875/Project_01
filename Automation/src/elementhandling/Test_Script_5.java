package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement check = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		
		// identify tag
		String tag = check.getTagName();
		System.out.println(tag);
		
		// identify attribute
		String attribute = check.getAttribute(tag);
		System.out.println(attribute);
		
		// identify text
		String text = check.getText();
		System.out.println(text);
	}

}
