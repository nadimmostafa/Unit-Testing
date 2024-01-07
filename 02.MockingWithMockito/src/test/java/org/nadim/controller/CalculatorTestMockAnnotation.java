package org.nadim.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nadim.service.CalculatorService;

//To active JUnit with mockito
@ExtendWith(MockitoExtension.class)
public class CalculatorTestMockAnnotation {
	
	//create one dummy object by mockito
	@Mock
	CalculatorService service;
	
	//It will find all dependencies and inject them(like autowired)
	@InjectMocks
	CalculatorController controller;
	
	@Test
	void testAdd() {
		//2. dummy implementation
		when(service.additionTwoNumbers(anyInt(), anyInt())).thenReturn(25);
		Integer actualResult = controller.additionThreeNumber(10, 15, 6);
		//3. verify our result
		assertEquals(31, actualResult);
	}
}
