package com.ordestiny.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringCalculatorTest {

	private StringCalculator fixture;

	@BeforeEach
	public void setup() {
		this.fixture = new StringCalculator();
	}

	@ParameterizedTest
	@CsvSource({ "'',0", "1,1", "'1.1,2.2',3.3", "'1\n2,3', 6", "'//;\n1;2',3", "'//|\n1|2|3', 6", "'//sep\n2sep3',5",
			"'//;\n',0" })
	public void add_WithValidNumber_SumOfNumbers(String input, String expected) {
		final String actual = fixture.add(input);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "//|\n1|2,3", "//a\n1a2a3a4b5", "//%\n1%4$5", "//c\n1c2c" })
	public void add_WithInvalidInput_ThrowException(String input) {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			fixture.add(input);
		});

		String expectedMessage = "expected but";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
