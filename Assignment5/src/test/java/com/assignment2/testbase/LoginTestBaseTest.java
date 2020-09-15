package com.assignment2.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class LoginTestBaseTest {
	@BeforeClass
	public static void init() {
	RestAssured.baseURI ="http://restcountries.eu/rest/v1/name";
	}

}
