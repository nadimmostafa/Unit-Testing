package org.nadim.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Calculator2Test {

	Calculator2 c = null;
	
	@BeforeEach
	void init() {
		c = new Calculator2();
	}
	
	@ParameterizedTest
	@CsvSource({"2,4","3,3","5,1","6,8"})
	@DisplayName("Addition Operation")
	void testAdd(int x, int y) {
		int expectedResult = 6;
		int actualResult = c.add(x, y);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Multiplication Operation")
	void testMul() {
		int expectedResult = 12;
		int actualResult = c.mul(3, 4);
		
		assertEquals(expectedResult, actualResult);
	}
	
	void cleanUp() {
		c= null;
	}
}
