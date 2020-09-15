package com.studentapp.utils;

import java.util.Random;

public class StudentUtilsTest {
	public static String getRandomValue() {
		Random ran = new Random();
		int randomInt=ran.nextInt(10000);
		return Integer.toString(randomInt);
	

}
}
