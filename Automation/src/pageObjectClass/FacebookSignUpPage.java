package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPage {
	
	private WebElement firstName;
	private WebElement lastName;
	private WebElement mobileNumber;
	private WebElement password;
	private WebElement date;
	private WebElement month;
	private WebElement year;
	private WebElement femaleOption;
	private WebElement maleOption;
	private WebElement customOption;
	private WebElement signUpButton;
	
	public FacebookSignUpPage(WebDriver driver) {
		firstName = driver.findElement(By.name("firstname"));
		lastName = driver.findElement(By.name("lastname"));
		mobileNumber = driver.findElement(By.name("reg_email__"));
		password = driver.findElement(By.name("reg_passwd__"));
		date = driver.findElement(By.id("day"));
		month = driver.findElement(By.id("month"));
		year = driver.findElement(By.id("year"));
		femaleOption = driver.findElement(By.xpath(".//input[@value='1']"));
		maleOption = driver.findElement(By.xpath(".//input[@value='2']"));
		customOption = driver.findElement(By.xpath(".//input[@value='-1']"));
		signUpButton = driver.findElement(By.name("websubmit"));
	}
	
	public void setName(String f_name, String l_name) {
		firstName.sendKeys(f_name);
		lastName.sendKeys(l_name);
		
	}
	
	public void setMobileNumber(String number) {
		mobileNumber.sendKeys(number);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
		
	}
	
	public void selectDOB(String day, String monthString, String yearString ) {
		Select s1 = new Select(date);
		s1.selectByVisibleText(day);
		Select s2 = new Select(month);
		s2.selectByVisibleText(monthString);
		Select s3 = new Select(year);
		s3.selectByVisibleText(yearString);
	}
	
	public void clickOnSignUpButton() {
		signUpButton.click();
		
	}

}
