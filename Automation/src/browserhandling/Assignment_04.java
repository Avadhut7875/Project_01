package browserhandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.get("https://www.facebook.com");
        driver.get("https://www.myntra.com");
        driver.get("http://www.flipkart.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        
		

	}

}
