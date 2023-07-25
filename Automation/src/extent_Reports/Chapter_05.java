package extent_Reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter_05 {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		
		extentReports.createTest("Text Based Test")
		.log(Status.INFO, "info1")
		.log(Status.INFO, "<b>info2</b>")
		.log(Status.INFO, "<i>info3</i>");
		
		String xmlData="<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>";
		
		String jsonData="{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
		extentReports.createTest("XML Based Test")
		.log(Status.INFO, MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));
		
		extentReports.createTest("JSON Based Test")
		.info(MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));
		
		List<String> listData = new ArrayList<>();
		listData.add("Avadhut");
		listData.add("Mane");
		listData.add("Kolhapur");
		
		Map<Integer, String> mapData = new HashMap<>();
		mapData.put(101, "AVdhut");
		mapData.put(102, "Mane");
		mapData.put(103, "Kplhapur");
		
		Set<Integer> setData = mapData.keySet();
		
		extentReports.createTest("List based Test")
		.info(MarkupHelper.createOrderedList(listData))
		.info(MarkupHelper.createUnorderedList(listData));
		
		extentReports.createTest("Map based Test")
		.info(MarkupHelper.createOrderedList(mapData))
		.info(MarkupHelper.createUnorderedList(mapData));
		
		extentReports.createTest("Set based Test")
		.info(MarkupHelper.createOrderedList(setData))
		.info(MarkupHelper.createUnorderedList(setData));
		
		extentReports.createTest("Highlighted log test")
		.info(MarkupHelper.createLabel("This is highlighted Msg", ExtentColor.CYAN))
		.log(Status.INFO, "this is normal msg");
		
		try {
			int i=5/0;
			System.out.println(i);
		} catch (Exception e) {
			extentReports.createTest("This is exception test 1")
			.info(e);
		}
		
		Throwable t = new RuntimeException("this is custom exception");
		extentReports.createTest("This is exception test 2")
		.info(t);
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
