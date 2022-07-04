package com.Ebusniess.PostFreeAdd;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
public static void main(String[]args) {
	

	
		ExtentSparkReporter spark;
		ExtentReports report;
		//ExtentTest test;

		
			System.out.println("hai ----> i am onStart ");
			 spark=new ExtentSparkReporter("./extentReport/extentReport.html");
			spark.config().setDocumentTitle("DocumentTitle");
			spark.config().setTheme(Theme.DARK);
			spark.config().setReportName("ReportName");
			
			 report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("Environment", "TestNG environment");
			report.setSystemInfo("ReporterName", "Chandan_Rayappa ");
			report.setSystemInfo("Platform", "Windows 11");
			report.setSystemInfo("UnitTesting Tool", " TESTNG");
			report.setSystemInfo("Build management Tool", "Maven");
			report.setSystemInfo("AutomationTool", "Selenium ");
			
			
			report.flush();
			
	

	}
}


