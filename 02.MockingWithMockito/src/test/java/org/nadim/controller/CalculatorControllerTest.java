package org.nadim.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nadim.service.CalculatorService;

// to active junit with mockito
@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTest {

	CalculatorController controller=null;
	CalculatorService service = null;
	
	@BeforeEach
	void init() {
		//1. create mock/dummy object
		service = mock(CalculatorService.class);
		controller  = new CalculatorController(service);
	}
	@Test
	void testAdd() {
		//2. dummy implementation
		when(service.additionTwoNumbers(anyInt(), anyInt())).thenReturn(25);
		Integer actualResult = controller.additionThreeNumber(10, 15, 6);
		//3. verify our result
		assertEquals(31, actualResult);
	}
	
	@Test
	void testMul() {
		//2. dummy implementation
		when(service.division(anyInt(), anyInt())).thenReturn(23.5);
		Double actualResult = controller.multiply(47, 2, 2);
		Double expectedResult = 47.0;
		
		//3. verify our result
		assertEquals(expectedResult, actualResult);
	}
	
	@AfterEach
	void cleanUp() {
		service = null;
		controller  = null;
	}
}
