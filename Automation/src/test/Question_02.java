package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// select todays date
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']/div/div[@class='css-1dbjc4n r-18u37iz']/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]/../..//div[text()='11']")).click();
		
		// select return date october 10
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).click();
		Thread.sleep(3000);
		
//		String tgt_month = "October 2023";
		
//		while(true) {
//			Thread.sleep(4000);
//			String actual_month = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj']")).getText();
//			System.out.println(actual_month);
//			
//			if(tgt_month.equals(actual_month)) {
//				break;
//			}else {
//				driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]")).click();
//			}
//		}
//		
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[9]/../..//div[text()='10']")).click();
		
		Thread.sleep(2000);
		
//		Thread.sleep(2000);
//		
//		String tgt_date = "10";
//		
//		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]/ancestor::div[@class=\"css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088\"]//div[contains(text(),'"+tgt_date+"')]")).click();
		
		driver.quit();
	}

}
