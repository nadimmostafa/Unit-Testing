package org.nadim.Util;

public class Calculator {

	public int add(int ...x) {

		int result=0;
		for (int i : x) {
			result += i;
		}
		return result;
	}

	public Integer div(int x, int y) {
		if(y<1) {
			throw new IllegalArgumentException("Y can not be less than 1");
		}
		return x/y;
	}
}
