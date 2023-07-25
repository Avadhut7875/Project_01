package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

	}

}
