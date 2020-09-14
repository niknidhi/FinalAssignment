package com.countrysearch.testbase;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

public class CountrySearchTestbaseTest {
	@BeforeClass
	public static void init() {
	RestAssured.baseURI ="http://restcountries.eu/rest/v1/name";
	}
		
}
