package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class SignUpPage {
	
	WebDriver driver;
	
	@FindBy(how = How.NAME, using = "firstname")
	WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastname")
	WebElement lastName;
	
	@FindBy(name = "reg_email__")
	WebElement email;
	
	@FindBy(name = "reg_email_confirmation__")
	WebElement cemail;
	
	@FindBy(id = "password_step_input")
	WebElement password;
	
	@FindBy(id = "day")
	WebElement day;
	
	@FindBy(id = "month")
	WebElement month;
	
	@FindBy(id = "year")
	WebElement year;
	
	@FindBy(xpath = "(//label[normalize-space()='Male'])[1]")
	WebElement gender;
	
	@FindBy(xpath = "(.//button[text()='Sign Up'])[1]")
	WebElement signupBtn;
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void setFirstName(String fName) {
		
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void setEmail(String emailId) {
		email.sendKeys(emailId);
	}
	
	public void setCEmail(String cemailId) {
		cemail.sendKeys(cemailId);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void setDay(String dayString)  {
		
		Select select = new Select(day);
		select.selectByVisibleText(dayString);
	}
	
	public void setMonth(String monthString) {
		Select select = new Select(month);
		select.selectByVisibleText(monthString);
	}
	
	public void setYear(String yearString) {
		Select select = new Select(year);
		select.selectByVisibleText(yearString);
	}
	
	public void setGender() {
		gender.click();
	}
	
	public void signupBtnClick() {
		signupBtn.click();
	}
	
	

}
