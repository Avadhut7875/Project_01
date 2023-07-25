package extent_Reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter_04 {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		
		ExtentTest test1 = extentReports.createTest("Test 1");
		test1.log(Status.FAIL, "this is Failed");
		test1.log(Status.SKIP, "this is Skipped");
		test1.log(Status.INFO, "this is Info");
		test1.log(Status.WARNING, "this is warning");
		test1.log(Status.PASS, "this is passed");
		test1.pass("This is passed");
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
