package com.ordestiny.tdd.kata;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class StringCalculator {

	private static final String NEWLINE = "\n";
	private static final String CUSTOM_DELIMITER_SUFFIX = NEWLINE;
	private static final String DEFAULT_DELIMITERS = ",|" + NEWLINE;
	private static final String CUSTOM_DELIMITER_PREFIX = "//";

	public String add(String number) {
		String delimiter = DEFAULT_DELIMITERS;
		String numbers = number;

		if (number.startsWith(CUSTOM_DELIMITER_PREFIX)) {
			delimiter = getCustomDelimiter(number);
			numbers = getNumbersInput(number);
			validateInput(numbers, delimiter);
		}

		if (numbers.isEmpty()) {
			return "0";
		}

		if (isInvalidLastCharacterIn(numbers)) {
			throw new IllegalArgumentException("Number expected but found EOF");
		}

		double result = getSum(numbers, delimiter);
		return format(result);
	}

	private String getCustomDelimiter(String input) {
		int indexOfDelimiterStart = input.lastIndexOf(CUSTOM_DELIMITER_PREFIX) + 2;
		int indexOfNumbersStart = input.indexOf(CUSTOM_DELIMITER_SUFFIX);

		String unquotedDelimiter = input.substring(indexOfDelimiterStart, indexOfNumbersStart);

		return unquotedDelimiter;
	}

	private String getNumbersInput(String input) {
		return input.substring(input.lastIndexOf(NEWLINE) + 1);
	}

	private boolean isInvalidLastCharacterIn(String numbers) {
		return Character.digit(numbers.charAt(numbers.length() - 1), 10) < 0;
	}

	private void validateInput(String input, String delimiter) {
		for (int i = 1; i < input.length(); i += 2) {
			int expectedDelimiterIndex = i + delimiter.length();

			if (expectedDelimiterIndex < input.length()) {
				String delimiterInString = input.substring(i, expectedDelimiterIndex);

				if (!delimiterInString.equals(delimiter)) {
					String exceptionMessage = String.format("'%s' expected but '%s', found at position %d", delimiter,
							delimiterInString, i);
					throw new IllegalArgumentException(exceptionMessage);
				}
			}
		}
	}

	private double getSum(String numbers, String delimiter) {
		if (delimiter.matches("[^A-Za-z0-9]")) {
			// Quote any delimiter that is a special character, such as `|`
			delimiter = Pattern.quote(delimiter);
		}

		String[] arrayOfStringNumbers = numbers.split(delimiter);

		return sumStringDigits(arrayOfStringNumbers);
	}

	private double sumStringDigits(String[] digitsArray) {
		double result = 0.0;

		for (String digit : digitsArray) {
			double num = Double.parseDouble(digit);
			result += num;
		}

		return result;
	}

	private String format(double value) {
		DecimalFormat format = new DecimalFormat("0.#");
		return format.format(value);
	}
}
