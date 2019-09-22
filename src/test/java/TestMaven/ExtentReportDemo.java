package TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {

	public static void main(String[] args) 
	   {
		 /*WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.facebook.com/"); */
		
	//	ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\Premkumar\\Desktop\\New folder\\Screenshot.html");   //create file
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("C:\\Users\\Premkumar\\Desktop\\New folder\\Screenshot\\Batch.html");
	 	ExtentReports report=new ExtentReports();
		report.attachReporter(htmlReporter);
		ExtentTest logger = report.createTest("Aut_01_VeryfyLogin","User is Login Successfull");

		logger.log(Status.PASS,"Username Enter Successfully");
		logger.log(Status.PASS,"Password Enter Successfully");
		logger.log(Status.FAIL,"Unable to click login button");
		logger.log(Status.INFO,"Home page is not display");
		report.flush();
	   }
}




















