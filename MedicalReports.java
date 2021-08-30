package MavenAssignment.MavenAssignment1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MedicalReports {
	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void after()
	{
		driver.quit();
	}
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
	  Set<String> wh=driver.getWindowHandles();
	  System.out.println(wh.size());
	  for(String s:wh)
	  {
		  driver.switchTo().window(s);
		  String url=driver.getCurrentUrl();
		  if(url.equals("http://openclinic.sourceforge.net/openclinic/medical/index.php"))
		  {
			  driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
			  Set<String> wh1=driver.getWindowHandles();
			  System.out.println(wh.size());
			  for(String s1:wh1)
			  {
				  driver.switchTo().window(s);
				  String url1=driver.getCurrentUrl();
				  Thread.sleep(2000);
				  if(url1.equals("http://openclinic.sourceforge.net/openclinic/medical/patient_search_form.php"))
				  {
					  WebElement we=driver.findElement(By.id("search_type"));
					  Select sel=new Select(we);
					  Thread.sleep(2000);
					  sel.selectByIndex(0);
					  Thread.sleep(5000);
					  driver.findElement(By.xpath("//*[@id=\"search_patient\"]")).click();
					  Thread.sleep(5000);
					  Set<String> wh2=driver.getWindowHandles();
					  System.out.println(wh.size());
					  for(String s2:wh2)
					  {
						  driver.switchTo().window(s);
						  String url2=driver.getCurrentUrl();
						  if(url1.equals("http://openclinic.sourceforge.net/openclinic/medical/patient_search.php"))
						  {
							  break;

						  }
					  }
					  
				  }
				  
			  }
		  }
	  }
  }
}
