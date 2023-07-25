package browserhandling;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		// handle login popup
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Dimension d = new Dimension(200,200);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point point = new Point(200, 150);
		driver.manage().window().setPosition(point);
		Thread.sleep(3000);
		

	}

}
