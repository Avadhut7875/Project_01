package browserhandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	// open browser
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(4000);
	// open Apllication
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	// verify google page displayed or not
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
			System.out.println("google page opened");
		}else {
			System.out.println("google page not opened");
		}
		
	// close browser
		driver.close();

	}

}
