package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_07 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// enter un
	    WebElement email =	driver.findElement(By.id("email"));
	    
	    
	    int height = email.getSize().getHeight();
	    int width = email.getSize().getWidth();
	    
	    System.out.println("email height: "+height+" email width: "+width);
	    
	    int x_loc = email.getLocation().getX();
	    int y_loc = email.getLocation().getY();
	    
	    System.out.println("email field x-location: "+x_loc+" email field y-location: "+y_loc);
	}

}
