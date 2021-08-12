package MavenAssignment.MavenAssignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class property {
	
  public static void main(String[] args)  {
	  File file = new File("C:\\Users\\slmv reddy\\eclipse-workspace\\MavenAssignment1\\src\\test\\java\\MavenAssignment\\MavenAssignment1\\file.properties");
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("modalusername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("current-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("//*[@id=\\\"root\\\"]/div/div/div[4]/div/div/div[4]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/button")).click();

		
		
		System.out.println("URL ::" + prop.getProperty("URL"));
		System.out.println("User name::" +prop.getProperty("username"));
	    System.out.println("Password::" +prop.getProperty("password"));
  }
}