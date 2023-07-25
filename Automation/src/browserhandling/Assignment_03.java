package browserhandling;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://www.flipkart.com");
		String title2 = driver2.getTitle();
		System.out.println(title2);
		
		if(title1.equals(title2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		

	}

}
