package MavenAssignment.MavenAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pincode {
	WebDriver driver;
	String url="https://chennaiiq.com/chennai/pincode_by_postal.asp";
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
  @Test
  public void f() {
	String s1=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr[4]/td[3]")).getText();
	String s2=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr[15]/td[3]")).getText();
	Assert.assertEquals(s1,s2);
	System.out.println("Equal");
	
  }
  @AfterClass
  public void after()
  {
	  driver.close();
  }
}
