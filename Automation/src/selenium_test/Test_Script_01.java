package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // login
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("pwd")).sendKeys("manager");
        Thread.sleep(2000);
        // select checkbox
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        Thread.sleep(2000);
        // login button
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        // add task
        driver.findElement(By.xpath("//span[contains(text(),'Add Tasks from the List')]")).click();
        Thread.sleep(2000);
        // select customer project
        driver.findElement(By.xpath("//body[1]/div[16]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        // select any project
        driver.findElement(By.xpath("//td[contains(text(),'Galaxy Corporation')]")).click();
        Thread.sleep(2000);
        // select 3rd checkbox
        driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
        Thread.sleep(2000);
        // select 4th checkbox
        driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
        Thread.sleep(2000);
        // click on add select 
        driver.findElement(By.xpath("//button[contains(text(),'Add Selected')]")).click();
        Thread.sleep(2000);
        // display msg
        WebElement successmsg = driver.findElement(By.xpath("//span[contains(text(),'Tasks were successfully added to the Enter Time-Tr')]"));
        boolean status = successmsg.isDisplayed();
        
        if(status) {
        	System.out.println("msg displayed");
        }else {
			System.out.println("msg not displayed");
		}
        
        Thread.sleep(2000);
        
        driver.quit();
	}

}
