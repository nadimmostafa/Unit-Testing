package org.nadim.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test case for Calculator")
class CalculatorTest {
	private Calculator calculator = null;
	
	@BeforeEach
	void initCalculator() {
		System.out.println("Calculator initialized");
		calculator = new Calculator();
	}
	
	@Test
	@Disabled
	void addTest() {
		int x = 10;
		int y = 20;
		int expected = 30;
		int actual  = calculator.add(x,y);
		assertEquals(expected, actual);
	}
	
	@RepeatedTest(5)
	@Disabled
	void addRandomValueTest() {
		Random random = new Random();
		int a = random.nextInt();
		int b = random.nextInt();
		
		int expectedResult = a+b;
		int actualResult = calculator.add(a,b);
		assertEquals(expectedResult,actualResult);
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(ints = {1}) // for single param
	void AddparameterizedMethodTest(int x) {
		int expected = 1;
		int actual  = calculator.add(x);
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Disabled
	@ParameterizedTest
	@CsvSource({"1,2","3,7","2,1"}) // for multiple param
	void parameterizedMethodTest(int x, int y) {
		int expected = 3;
		int actual  = calculator.add(x,y);
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Disabled
	@ParameterizedTest
	@CsvSource({"1,2,5"}) // for multiple param
	void addParameterizedMethodTest(int x, int y,int z) {
		int expected = 8;
		int actual  = calculator.add(x,y,z);
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	void divTest() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, 
				()->calculator.div(3,0)
				);
		
		System.out.println(exception);
		assertEquals("Y can not be less than 1", exception.getMessage());
	}
	
	
	@AfterEach
	void cleanUpCal() {
		System.out.println("Destroy Calculator");
		calculator = null;
	}
}
