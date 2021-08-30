package MavenAssignment.MavenAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailAccountSignup {
	WebDriver driver;
	String url="https://accounts.google.com/signup";
	@BeforeTest
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
  public void f() {
	  WebElement we=driver.findElement(By.id("firstName"));
	  we.sendKeys("malli");
	  String typeValue=we.getAttribute("type");
	  System.out.println(typeValue);
	  WebElement we1=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	  we1.sendKeys("gare");
	  String typeValue1=we.getAttribute("type");
	  System.out.println(typeValue1);
	  driver.findElement(By.id("username")).sendKeys("malligare92");
	  driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("MalliGare@92");
	  driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("MalliGare@92");
	  driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
	  
  }
}
