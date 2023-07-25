package multipleElementHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/VS%20code/Selenium/dropDown.html");
		
		Thread.sleep(2000);
		WebElement list_box = driver.findElement(By.id("list"));
		list_box.click();
		
		// create select class object
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(list_box);
		
		boolean status;
		status = sel.isMultiple();
		
		if(status) {
			System.out.println("List box is multi selectable");
		}else {
			System.out.println("List box is not multi selectable");
		}
		
		Thread .sleep(2000);
		
		List<WebElement> options = sel.getOptions();
		
		System.out.println("Total no of options present are : "+options.size());
		Thread.sleep(2000);
		
		for(WebElement a:options) {
			System.out.println(a.getText());
		}
		
		// select alternate options
		for(int i=0;i<options.size();i+=2) {
			sel.selectByIndex(i+1);
		}
		
		// print how many option contains "Test"
		int count =0;
		for(int i=0;i<options.size();i++) {
			String opt = options.get(i).getText();
			if(opt.contains("Test")) {
				count++;
			}else {
				
			}
			
		}
		System.out.println("Test conating options are : "+count);
		
		

	}

}
