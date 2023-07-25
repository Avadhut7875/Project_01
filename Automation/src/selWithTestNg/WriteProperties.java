package selWithTestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
//		p.load(new FileInputStream("../Automation/Property/sample.properties"));
		p.put("appUrl","https://www.facebook.com");
		p.store(new FileOutputStream("../Automation/Property/sample.properties"), "sampleData");

	}

}
