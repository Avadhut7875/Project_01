package popupHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// click on sign up button
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		// frame
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='modalIframe'])[1]"));
		// switch to frame
		driver.switchTo().frame(frame);
		// click on google
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		Thread.sleep(1000);
		// click on facebook
		driver.findElement(By.xpath("//div[@class=\"social-acc-box\"]")).click();
		Thread.sleep(1000);
		// print count of windows
		Set<String> names = driver.getWindowHandles();
		System.out.println("total windows present are: "+names.size());
		
		// Question 1
		// print all window titles
		Iterator<String> itr = names.iterator();
		
//		while(itr.hasNext()) {
//			String refId = itr.next();
//			driver.switchTo().window(refId);
//			String title = driver.getTitle();
//			System.out.println("Title of page is: "+title);
//		}
		
		// Question 2
//		while(itr.hasNext()) {
//			String refId = itr.next();
//			driver.switchTo().window(refId);
//			driver.close();
//		}
		
		// Question 3
		String parentRefId = driver.getWindowHandle();
		
		while(itr.hasNext()) {
			
			String refId = itr.next();
			if(!parentRefId.equals(refId)) {
				driver.switchTo().window(refId);
				driver.close();
			}
		
		}
		
		
		
		

	}

}
