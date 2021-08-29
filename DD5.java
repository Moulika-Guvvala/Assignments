package DefinitionFiles;

import org.testng.annotations.DataProvider;

public class DD5 {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		
		Object[][] obj = new Object[3][1];
		obj[0][0]="Moulika";
		obj[1][0]="Guvvala";
		obj[2][0]="OK";
		
		return obj;
	}
	@org.testng.annotations.Test(dataProvider = "data-provider")
	public void myTest (String a) {
		System.out.println(a);
	}

	
}
