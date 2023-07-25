package browserhandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	// open browser
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(4000);
	// open application
		driver.get("https://www.google.com");
	// print title and url
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
