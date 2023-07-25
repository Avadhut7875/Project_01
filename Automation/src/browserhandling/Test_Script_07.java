package browserhandling;

public class Test_Script_07 extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BaseClass.openBrowser("Edge");
		Thread.sleep(3000);
		BaseClass.openApp("https://www.facebook.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BaseClass.closeBrowser();

	}

}
