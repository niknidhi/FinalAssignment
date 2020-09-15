package com.studentapp.info;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.student.model.StudentModelTest;
import com.student.testbase.StudentTestBaseTest;
import com.studentapp.utils.StudentUtilsTest;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
@RunWith(SerenityRunner.class)
public class NewStudentCreationTest extends StudentTestBaseTest{
	static String firstName= "Nanaradha"+StudentUtilsTest.getRandomValue();
	static String lastName= "Naniradha"+StudentUtilsTest.getRandomValue();
	static String email= StudentUtilsTest.getRandomValue()+"bhartitanisha1234@gmail.com";
	static String programme= "Social Science";
	
@Title("To create new student")
@Test
public void createStudent() {
	ArrayList <String> courses = new ArrayList<String>();
	courses.add("History");
	courses.add("Civics");
	courses.add("Geography");
	courses.add("Political Science");
	
	StudentModelTest stu = new StudentModelTest();
	stu.setFirstName(firstName);
	stu.setLastName(lastName);
	stu.setEmail(email);
	stu.setProgramme(programme);
	stu.setCourses(courses);
	
	SerenityRest.given()
	.contentType(ContentType.JSON)
	.log().all()
	.when()
	.body(stu)
	.post()
	.then()
	.log()
	.all()
	.statusCode(201);
}
}
