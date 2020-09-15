package com.valid.login;


import org.junit.Test;
import org.junit.runner.RunWith;

import com.assignment4.testbase.LoginTestBaseTest;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
@RunWith(SerenityRunner.class)
public class LoginScenarioTest extends LoginTestBaseTest{
	
	@Title("This is valid login")
		@Test
		public void validLogin() {
			
			RestAssured.given().auth().preemptive().basic("postman","password")
			.when()
			.get("/basic-auth")
			.then()
			.assertThat()
			.log()
			.all()
			.statusCode(200); 
			
		}
	@Title("This is invalid login")
		@Test
		public void invalidLogin() {
			
			RestAssured.given().auth().preemptive().basic("postman","password1")
			.when()
			.get("/basic-auth")
			.then()
			.assertThat()
			.log()
			.all()
			.statusCode(401); 
			
		}
	}
		

