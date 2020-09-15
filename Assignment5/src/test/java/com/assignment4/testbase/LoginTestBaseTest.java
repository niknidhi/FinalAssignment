package com.assignment4.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class LoginTestBaseTest {
	@BeforeClass
	public static void init() {
	RestAssured.baseURI ="https://postman-echo.com";
	}

}
