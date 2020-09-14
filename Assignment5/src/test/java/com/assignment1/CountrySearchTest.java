package com.assignment1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.countrysearch.testbase.CountrySearchTestbaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
@RunWith(SerenityRunner.class)
public class CountrySearchTest extends CountrySearchTestbaseTest{
	@Title("Validating Republic of India")
	@Test
	public void getRepublicOfIndia() {	
Response res=RestAssured.given().when().get("/INDIA").then().extract().response();
ResponseBody<?> body = res.getBody();
String bodyStringValue = body.asString();
Assert.assertTrue(bodyStringValue.contains("Republic of India"));
System.out.println("Republic of India");
	}
	
	@Title("Retrieve Invalid Country code")
	@Test
	public void getInvalidCountryCode() {
		RestAssured.when().get("/xyz")
		.then()
		.assertThat()
		.statusCode(404)
		.log()
		.all();
		}
	

	
	
}