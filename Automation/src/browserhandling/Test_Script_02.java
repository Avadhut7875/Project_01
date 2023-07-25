package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(4000);
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();

	}

}
