package SetupPackage;

import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import utilities.ExcelReader;

public class base {
	
	public static Properties config = new Properties();
	private FileInputStream fis;
	public ExcelReader excel = new ExcelReader(".//src//test//resources//TestExcelFile//testdata.xlsx");
	
	@BeforeSuite
	public void setup() {
		
		try {
			fis = new FileInputStream(".//src//test//resources//PropertiesFile//config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RestAssured.baseURI = config.getProperty("baseURI");
		RestAssured.basePath = config.getProperty("basePath");
		
	}
	
	@AfterMethod
	@AfterSuite
	public void tearDown() {
		
	}

}
