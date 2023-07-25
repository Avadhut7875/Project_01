package multipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/56654/wel-vs-akl-29th-match-super-smash-2022-23");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Scorecard')]")).click();
		Thread.sleep(1000);
		
		List<WebElement> name1 = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//a[1]"));
		List<WebElement> score1 = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//a[1]/../..//div[@class=\"cb-col cb-col-8 text-right text-bold\"]"));
		
		for(int i=0;i<score1.size();i++) {
			String pName = name1.get(i).getText();
			String pScore = score1.get(i).getText();
			
			System.out.println(pName+" Runs are : "+pScore);
		}
		
	}

}
