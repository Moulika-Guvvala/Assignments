package MavenAssignment.MavenAssignment1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class DropDown
{
	WebDriver driver;
	String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
			
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void after()
	{
		driver.close();
	}
	
}


