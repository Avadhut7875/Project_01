package multipleElementHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/VS%20code/Selenium/table.html");
		Thread.sleep(2000);
		
		// print total no of rows as output
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println("Total no of rows are : "+rows.size());
		
		// print every book name with price
		List<WebElement> booksName = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[2]"));
		List<WebElement> bookPrice = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[3]"));
		
		for(int i=0;i<booksName.size();i++) {
			String name = booksName.get(i).getText();
			String p = bookPrice.get(i).getText();
			
			System.out.println("Name of book is : "+name+"\nprice of the book is : "+p);
		}
		System.out.println("*************************");
		
		List<Integer> cost = new ArrayList<>();
		for(int i=0;i<bookPrice.size();i++) {
			String p = bookPrice.get(i).getText();
			int value = Integer.parseInt(p);
			cost.add(value);
			
		}
		Collections.sort(cost);
		
		System.out.println(cost);
		System.out.println("*************************");
		
		int sum =0;
		for(int i=0;i<cost.size();i++) {
			sum+=cost.get(i);
		}
		
		WebElement rv = driver.findElement(By.xpath(".//tr[7]/th[3]"));
		String total1 = rv.getText();
		int total2 = Integer.parseInt(total1);
		
		System.out.println("Actal summation is : "+sum);
		System.out.println("*************************");
		if(sum==total2) {
			System.out.println("cost is correct");
		}else {
			System.out.println("cost is incorrect");
		}
	}

}
