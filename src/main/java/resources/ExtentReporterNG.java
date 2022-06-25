package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	static ExtentReports addReport;
	public static ExtentReports getReportObject() {
		
		String reportsPath = System.getProperty("user.dir")+"\\src\\test\\reports.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportsPath);
		reporter.config().setReportName("Project Actitime Results");
		reporter.config().setDocumentTitle("Time Tracker Application");
		
		addReport = new ExtentReports();
		addReport.attachReporter(reporter);
		addReport.setSystemInfo("Tester", "Ajinesh");
		
		return addReport;
	}
}
