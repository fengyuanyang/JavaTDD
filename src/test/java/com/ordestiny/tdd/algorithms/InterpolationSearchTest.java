package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterpolationSearchTest {

	private Integer[] arrayToTest;

	@BeforeEach
	public void init() {
		arrayToTest = new Integer[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

	}

	@Test
	public void findPos_SearchValidValue_FindCorrectPosOfValue() throws Exception {
		int expected = 4;
		int elementToFindInArray = 18;
		InterpolationSearch interpolationSearch = new InterpolationSearch();
		int actual = interpolationSearch.findPos(arrayToTest, elementToFindInArray);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void findPos_SearchValidValue_NotFindPosOfValue() throws Exception {
		int elementToFindInArray = 1;
		int expected = -1;
		InterpolationSearch interpolationSearch = new InterpolationSearch();
		int actual = interpolationSearch.findPos(arrayToTest, elementToFindInArray);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void findPos_ArrayNotOrdered_ThrowExceptionifArrayNotOrdered() throws Exception {
		arrayToTest = new Integer[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47, 41 };
		int elementToFindInArray = 1;
		InterpolationSearch interpolationSearch = new InterpolationSearch();
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> interpolationSearch.findPos(arrayToTest, elementToFindInArray));

	}

}
