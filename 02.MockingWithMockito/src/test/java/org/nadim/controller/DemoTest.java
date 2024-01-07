package org.nadim.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DemoTest {
	
	List<Integer> listMock = null;
	
	@Test
	void testList() {
		// create mock object
		listMock = mock(List.class);
		// dummy implementation
		when(listMock.get(0)).thenReturn(18);
		assertEquals(18, listMock.get(0));
	}
	
	@Test
	void testList2() {
		// create mock object
		listMock = spy(List.class);
		listMock.add(12);
		listMock.add(12);
		
		verify(listMock,times(2)).add(12);
	}
}
