package extent_Reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter_06 {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		
		extentReports.createTest("Screenshot test 1","This is for attaching The screenshot for test at test level");
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
