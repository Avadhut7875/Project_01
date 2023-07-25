package browserhandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		int h = driver.manage().window().getSize().getHeight();
		int w = driver.manage().window().getSize().getWidth();
		Thread.sleep(3000);
		Dimension dimension = new Dimension(w/2, h/2);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		driver.close();
		

	}

}
