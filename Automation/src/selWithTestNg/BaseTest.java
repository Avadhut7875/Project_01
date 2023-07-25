package selWithTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		}
		
	}
	
	@BeforeMethod
	public void openApp() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void testExecutionResult(ITestResult result) {
		String methodName = result.getName();
		int status = result.getStatus();
		
		if(status==1) {
			Reporter.log(methodName+" execution is pass",true);
		}else if (status==2) {
			Reporter.log(methodName+" execution is fail",true);
		}else if(status==3) {
			Reporter.log(methodName+" execution is skip",true);
		}
	}

}
