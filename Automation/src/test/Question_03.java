package test;

import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
		loginBtn.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).click();
		
		Set<String> windowNames = driver.getWindowHandles();
//		System.out.println(windowNames);
		
		Iterator<String> iterator = windowNames.iterator();
		String window1 = iterator.next();
//		System.out.println(window1);
		String window2 = iterator.next();
//		System.out.println(window2);
		
		driver.switchTo().window(window2);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
		
		Select select = new Select(dropDown);
		select.selectByValue("MR");
		
	    WebElement name=driver.findElement(By.xpath("//input[@id='first_name']"));
	    name.sendKeys("Avadhut");
	    
	    WebElement lastName=	driver.findElement(By.xpath("//input[@id='last_name']"));
	    lastName.sendKeys("Mane");
	
	    WebElement date = driver.findElement(By.xpath("//input[@id='dobDate']"));
	    date.click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select select2 = new Select(year);
		select2.selectByVisibleText("1999");
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select select3 = new Select(month);
		select3.selectByVisibleText("February");
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'Choose Monday, February 22nd, 1999')]")).click();
		
		WebElement phone =	driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']"));
		phone.sendKeys("9876543210");
		
//		Thread.sleep(2000);
		
//		Actions action = new Actions(driver);
		WebElement email =	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/input[1]"));
//		email.click();
//		email.sendKeys("av@gamil.com");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','av@gamil.com')", email);
//		js.executeScript("document.getElementById('email_id').value='av@gamil.com'");
//		action.sendKeys(email, "avadhut7865@gmail.com");
	
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("Avadhut@258");
		
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("Avadhut@258");
		
//		driver.findElement(By.xpath("//input[@id='defaultCheck1']")).click();
		
//		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(3000);
		
		String nameText = name.getAttribute("value");
		System.out.println("Name is : "+nameText);
		
		String lastNameText = lastName.getAttribute("value");
		System.out.println("Last Name is : "+lastNameText);
		
		String birthDate = date.getAttribute("value");
		System.out.println("Date of Birth is : "+birthDate);
		
		String emailText = email.getAttribute("value");
		System.out.println("Email Id is : "+emailText);

	}

}
