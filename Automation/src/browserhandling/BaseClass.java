package browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static WebDriver driver;

	public static void openBrowser(String browsername) {
		if (browsername.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
	}

	public static void openApp(String url) {
		driver.get(url);
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
