package org.nadim.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringOperationTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"","Nadim","Mostafa"})
	void checkBlank(String str) {
		assertTrue(StringUtils.isBlank(str));
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"I ","am ","Nadim ","Mostafa"})
	void joinStringArr(String str) {
		char c ='m';
		System.out.println(StringUtils.reverse(str));
	}
}
