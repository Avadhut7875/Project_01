package selWithTestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		p.load(new FileInputStream("../Automation/Property/data.properties"));
		
		WebDriver driver = new EdgeDriver();
		
		String urlString = p.getProperty("appUrl");
		System.out.println(urlString);
		
		driver.get(p.getProperty("appUrl"));
		driver.findElement(By.id("email")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
	}

}
