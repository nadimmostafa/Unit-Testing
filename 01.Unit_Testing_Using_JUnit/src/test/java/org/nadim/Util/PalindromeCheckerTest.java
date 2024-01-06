package org.nadim.Util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheckerTest {
	
	PalindromeChecker pc = null;
	
	@BeforeEach
	void setUp() {
		pc = new PalindromeChecker();
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"racecar","amma","nadim","liril"})
	void testIsPalindrome(String str) {
		boolean actualResult = pc.isPalindrome(str);
		assertTrue(actualResult);
	}
	
	@BeforeEach
	void cleanUp() {
		pc = null;
	}
}
