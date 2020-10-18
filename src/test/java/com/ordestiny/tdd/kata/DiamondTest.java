package com.ordestiny.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class DiamondTest {

	@Test
	public void buildDiamond_whenWidestPointCharIsNull_returnException() {
		assertThrows(IllegalArgumentException.class, () -> Diamond.buildDiamond('1'));
	}

	@Test
	public void buildDiamond_validWidestPointChars_returnCorrectDiamondString() {
		Map<Character, String> diamonds = new HashMap<>();
		diamonds.put('A', "A");
		diamonds.put('B', "ABBA");
		diamonds.put('C', "ABBCCCBBA");
		diamonds.put('D', "ABBCCCDDDDCCCBBA");
		diamonds.put('E', "ABBCCCDDDDEEEEEDDDDCCCBBA");
		diamonds.forEach(this::verifyDiamondString);
	}

	private void verifyDiamondString(char widestPointChar, String diamond) {
		assertEquals(Diamond.buildDiamond(widestPointChar), diamond);
	}

	@Test
	public void buildDiamond_widestPointCharSetToCharGreaterThanA_returnedValueHasCorrectNumberOfRepetitions() {
		// In each generated diamond string, the widest point character is repeated one time more than its distance to
		// the base character
		for (char widestPointChar = 'B'; widestPointChar <= 'Z'; widestPointChar++) {
			//assume
			int diagonalLength = widestPointChar - Diamond.BASE_CHARACTER + 1;

			//act
			String diamondString = Diamond.buildDiamond(widestPointChar);

			//assert
			char[] diagonal = new char[diagonalLength];
			Arrays.fill(diagonal, widestPointChar);

			assertTrue(diamondString.contains(String.valueOf(diagonal)));
			assertEquals(Math.pow(diagonalLength, 2), diamondString.length());
		}
	}

}
