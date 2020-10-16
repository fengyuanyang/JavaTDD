package com.ordestiny.tdd.range;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RangeTest {

	private Range range = new Range();
	
	@Test
	public void getAllPoints_whenStartNumberLessThanEndNumber_returnAllPointsFromStartToEnd() {
		int[] expectedResults = {2, 3, 4, 5, 6};
		assertArrayEquals(expectedResults, range.getAllPoints(2, 6));
	}
	
	@Test
	public void getAllPoints_whenStartNumberGreaterThanEndNumber_returnException() {
		assertThrows(IllegalArgumentException.class, () -> range.getAllPoints(3, 1));
	}
	
	@Test
	public void getAllPoints_whenStartNumberEqualEndNumber_returnArrayWithOneElement() {
		int[] expectedResults = {4};
		assertArrayEquals(expectedResults, range.getAllPoints(4, 4));
	}
}
