package Listners;

import org.testng.ITestListener;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager implements ITestListener {

	public static ExtentReports extent;
	
	
	
	@BeforeSuite
	    public static ExtentReports createInstance(String fileName) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	       
	        htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation Tester", "Deepika Tailor");
	        extent.setSystemInfo("Organization", "Self Study");
	        extent.setSystemInfo("Build no", "Build-1234");
	        
	        
	        return extent;
	    }

	
	

	}
