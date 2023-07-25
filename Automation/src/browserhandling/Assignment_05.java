package browserhandling;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_05 {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	// verify homepage displayed or not
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook ? log in or sign up")) {
			System.out.println("Homepage Displayed");
		}else {
			System.out.println("Homepage Not Displayed");
		}
		Thread.sleep(1000);
		
	// get dimenssion and position
		Dimension dimension= driver.manage().window().getSize();
		System.out.println(dimension);
		
		Point point = driver.manage().window().getPosition();
		System.out.println(point);
		Thread.sleep(1000);
		
	// close connection
		driver.quit();
		
		

	}

}
