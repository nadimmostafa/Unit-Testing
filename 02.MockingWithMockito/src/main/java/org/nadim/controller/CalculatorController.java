package org.nadim.controller;

import org.nadim.service.CalculatorService;

public class CalculatorController{
	
	private CalculatorService service;
	
	public CalculatorController(CalculatorService service){
		this.service = service;
	}
	
	public Integer additionThreeNumber(int x, int y, int z) {
		 Integer result = service.additionTwoNumbers(x, y);
		 return result + z;
	}
	
	public Double multiply(int x, int y, int z) {
		Double result = null;
		try {
			result = service.division(x, y);
		}catch(ArithmeticException e) {
			e.getMessage();
		}
		return result * z;
	}

}
