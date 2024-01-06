package org.nadim.Util;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StandardTest {
	
	@BeforeAll
    static void initAll() {
		// DB connection create once for every Methods which is required DB
    }

    @BeforeEach
    void init() {
    	// object created before one Test method execute
    }

    @Test
    void succeedingTest() {
    	//1. Arrange input or Pre-requisite
    	//2. take action
    	//3. verify our output
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
    	// object destroy after one Test methods execution completed
    }

    @AfterAll
    static void tearDownAll() {
    	//// DB connection close() after all method execution completed
    }
}
