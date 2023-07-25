package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
	
	private WebElement emailField;
	private WebElement passwordField;
	private WebElement forgotpwdlink;
	private WebElement loginButton;
	private WebElement createAccountButton;
	
	public FacebookLoginPage(WebDriver driver) {
		emailField = driver.findElement(By.id("email"));
		passwordField = driver.findElement(By.id("pass"));
		forgotpwdlink = driver.findElement(By.linkText("Forgotten password?"));
		loginButton = driver.findElement(By.name("login"));
		createAccountButton = driver.findElement(By.linkText("Create new account"));
	}
	
	public void setLoginCredentials(String email, String pwd) {
		emailField.sendKeys(email);
		passwordField.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnForgotPassword() {
		forgotpwdlink.click();
	}
	
	public void clickOnCraeteAccountButton() {
		createAccountButton.click();
		
	}
	

}
