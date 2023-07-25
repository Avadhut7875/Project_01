package selWithTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SelectedBrowser extends BaseTest {
	
	@Test
	public void test1() {
		Reporter.log("Hello",true);
	}

}
