package DefinitionFiles;

import org.bson.BasicBSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DD6 {
	@org.testng.annotations.DataProvider (name = "DataForPost")

	public Object[][] dataForPost() {
		Object[][] data = new Object[2][3];
		data[0][0] = "Albert";
		data[0][1] = "Einstein";
		data[0][2] =2;
		data[0][0] = "Thomas";
		data[0][1] = "Edison";
		data[0][2] =1;
		
		return data;
	}
	
	@Test(dataProvider = "DataForPost")
	public void test_1_post(String firstName, String lastName, int subjectId) {
		
	System.out.println(firstName);
	BasicBSONObject request = new BasicBSONObject();
	
	request.put("firstName",firstName);
	request.put("lastName",lastName);
    request.put("subjectId",subjectId);
 	System.out.println(request);
		
		
	RestAssured.given().headers("content-type", "application/json").body(request.toString()).when().post("http://api.exchangeratesapi.io/v1/latest?access_key=b735637fd9878096661343ed2ed964e4"
).then().statusCode(201).log().all();
		
	}

}
