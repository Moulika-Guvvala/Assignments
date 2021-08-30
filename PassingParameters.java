package MavenAssignment.MavenAssignment1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassingParameters {
  @Test(dataProvider="getdata")
  public void f(String name,String phoneNo) {
	  System.out.println("Name: "+name +",PhoneNo: "+phoneNo);
	  
  }
  @DataProvider(name="getdata")
  public Object[][] dataprovider()
  {
	  Object[][] data=new Object[2][2];
	  data[0][0]="John";
	  data[0][1]="9098979698";
	  data[1][0]="kousalya";
	  data[1][1]="9090989890";
	  return data;
  }
  
  
}
