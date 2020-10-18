package com.ordestiny.tdd.range;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

	@Test
	public void containsRange_whenRangeDoesntOverlaps_returnFalse() {
		assertFalse(range.containsRange(2,5,7,10));
	}

	@Test
	public void containsRange_whenHalfOfFirstRangeOverlapsSecondRange_returnFalse() {
		assertFalse(range.containsRange(2,5,3,10));
	}

	@Test
	public void containsRange_whenFirstRangeIsWithInSecondRange_returnFalse() {
		assertFalse(range.containsRange(3,5,2,10));
	}

	@Test
	public void containsRange_whenFirstRangeContainsSecondRange_returnTrue() {
		assertTrue(range.containsRange(2,10,3,5));
	}

	@Test
	public void containsRange_whenRangesAreEqual_returnTrue() {
		assertTrue(range.containsRange(3,5,3,5));
	}

	@Test
	public void containsRange_whenStartIsGreaterThanEnd_returnException() {
		assertThrows(IllegalArgumentException.class, () -> range.containsRange(5,3,3,5));
	}

	@Test
	public void containsRange_whenCompareStartIsGreaterThanCompareEnd_returnException() {
		assertThrows(IllegalArgumentException.class, () -> range.containsRange(3,5,5,3));
	}
}
