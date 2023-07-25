package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Test_Script_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	// get browsers dimensions
		int browserHeight = driver.manage().window().getSize().getHeight();
		System.out.println("Browser height is : "+browserHeight);
		int browserWidth = driver.manage().window().getSize().getWidth();
		System.out.println("Browser height is : "+browserWidth);
	//get browser position
		int browser_Xloc = driver.manage().window().getPosition().getX();
		System.out.println("Browser height is : "+browser_Xloc);
		int browser_Yloc = driver.manage().window().getPosition().getY();
		System.out.println("Browser height is : "+browser_Yloc);
	//change browser size
		Thread.sleep(4000);
	    Dimension dimension = new Dimension(400,600);
	    driver.manage().window().setSize(dimension);
	//change browser position
		Thread.sleep(4000);
		Point position = new Point(450,350);
		driver.manage().window().setPosition(position);
	//minimize the browser
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
