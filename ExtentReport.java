package MavenAssignment.MavenAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		
	}
	@Test
	public void test()
	{
		test=extent.createTest("Test case 1","PASSED test case");
		Assert.assertTrue(true);
	}
	@Test
	public void test1()
	{
		test=extent.createTest("Test case 2","PASSED test case");
		Assert.assertTrue(true);
	}
	@AfterTest
	public void after()
	{
		extent.flush();
		driver.close();
	}
	

}
