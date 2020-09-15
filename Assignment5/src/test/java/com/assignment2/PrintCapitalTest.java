package com.assignment2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.assignment2.testbase.LoginTestBaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
@RunWith(SerenityRunner.class)

public class PrintCapitalTest extends LoginTestBaseTest{


	@Title("Dipsplay detail of Norway Country details")
		@Test
		public void getRequestCountry() {
			SerenityRest.given()
			.when()
			.get("/norway")
			.then()
			.log()
			.all()
			.statusCode(200); 
			
		}
		@Title("Validating Norway Capital")
		@Test
		public void getValidateCapitalOfCountry() {	
	Response res=RestAssured.given().when().get("/norway").then().extract().response();
	ResponseBody<?> body = res.getBody();
	String bodyStringValue = body.asString();
	Assert.assertTrue(bodyStringValue.contains("\"capital\":\"Oslo\""));
		
		}
}
