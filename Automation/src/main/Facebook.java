package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectClass.LoginPage;
import pageObjectClass.SignUpPage;

public class Facebook {
	@Test
  public void signUp() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		LoginPage lp = new  LoginPage(driver);
		SignUpPage sp = new SignUpPage(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		lp.signupBtnClick();
		Thread.sleep(1000);
		sp.setFirstName("Avadhut");
		Thread.sleep(1000);
		sp.setLastName("Mane");
		Thread.sleep(1000);
		sp.setEmail("avadhut@gmail.com");
		Thread.sleep(1000);
		sp.setCEmail("avadhut@gmail.com");
		Thread.sleep(1000);
		sp.setPassword("124589652");
		Thread.sleep(1000);
		sp.setDay("22");
		Thread.sleep(1000);
		sp.setMonth("Feb");
		Thread.sleep(1000);
		sp.setYear("1999");
		Thread.sleep(1000);
		sp.setGender();
		Thread.sleep(1000);
		sp.signupBtnClick();
	
}
  
	
	
	
	

}
