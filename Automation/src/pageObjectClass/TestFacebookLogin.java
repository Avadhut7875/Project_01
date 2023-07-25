package pageObjectClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebookLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FacebookLoginPage lp = new FacebookLoginPage(driver);
		lp.setLoginCredentials("avadhut@gmail.com", "avadhut");
		lp.clickOnLoginButton();

	}

}
