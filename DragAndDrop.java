package MavenAssignment.MavenAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop
{
    WebDriver driver;
    String url="https://jqueryui.com/droppable/";
    @BeforeClass
    public void before()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	
    }
    @Test
    public void test() throws InterruptedException
    {
	WebElement fe=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
   	WebElement te=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
   	Actions action=new Actions(driver);
    action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"drag1\"]")),driver.findElement(By.xpath("//*[@id=\"div1\"]"))).perform();
    System.out.println("Dragged successfully");
    	
    }
    @AfterClass
    public void after()
    {
    	driver.close();
    }
}