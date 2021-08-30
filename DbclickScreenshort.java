package MavenAssignment.MavenAssignment1;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DbclickScreenshort {
	WebDriver driver;
	String url="https://api.jquery.com/dblclick/\n";
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	@AfterClass
	public void after()
	{
		driver.close();
	}
			
  @Test
  public void f() throws IOException {
//	  Date d=new Date();
//	  String fileName=d.toString().replace(".","_").replace(" ","_") + ".png";
	  File srcFile=(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
	  FileHandler.copy(srcFile,new File("D:\\sc.png"));
	  
	  
	  
  }
}
