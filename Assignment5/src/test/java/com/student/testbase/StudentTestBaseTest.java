package com.student.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class StudentTestBaseTest {
	@BeforeClass
	public static void init() {
	RestAssured.baseURI ="http://localhost:8080/student";
	}
}
