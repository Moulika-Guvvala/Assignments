package DefinitionFiles;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DD7 {
	@Test
	public void test()
	{
	Response response;
	response = RestAssured.get("http://localhost:8080/InfyClinicV2/APP_V2/getDoctor/byId?doctorId=1001");
	int statusCode = response.getStatusCode();
	Assert.assertNotEquals(statusCode,200);
	String statusLine = response.getStatusLine();
	Assert.assertNotEquals(statusLine , "HTTP/1.1 200 " );
	String contentType = response.getContentType();
	Assert.assertEquals(contentType , "application/json;charset=UTF-8");
	String responseBody = response.getBody().asString();
	Assert.assertEquals(responseBody.contains("John") , true , "Response body does not contain John");
	}
}
