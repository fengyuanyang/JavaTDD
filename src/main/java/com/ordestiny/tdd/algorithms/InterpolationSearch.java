package com.ordestiny.tdd.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterpolationSearch {

	public int findPos(Integer[] arrayToSearch, int elementToFind) {
		isOrdered(arrayToSearch);
		int findedPos = -1;
		int lowIndex = 0; // lo
		int highIndex = arrayToSearch.length - 1; // hi
		while ((lowIndex < highIndex) && isValidInterval(elementToFind, arrayToSearch, lowIndex, highIndex)) {
			int calculetedPos = getPos(arrayToSearch, elementToFind, lowIndex, highIndex);
			if (arrayToSearch[calculetedPos] == elementToFind) {
				findedPos = calculetedPos;
				break;
			}
			if (arrayToSearch[calculetedPos] < elementToFind) {
				lowIndex = calculetedPos + 1;
			} else {
				highIndex = calculetedPos - 1;
			}

		}
		return findedPos;
	}

	private void isOrdered(Integer[] arrayToSearch) {
		List<Integer> arrayToList = Arrays.stream(arrayToSearch).collect(Collectors.toList());
		List<Integer> copyList = new ArrayList<>(arrayToList);
		copyList.sort(Comparator.naturalOrder());
		boolean isNotOrdered = !copyList.equals(arrayToList);
		if(isNotOrdered) {
			throw new IllegalArgumentException("The array " + Arrays.toString(arrayToSearch) + " is not ordered");
		}
		
		
	}

	private int getPos(Integer[] sortedArray, int elementToFind, int lowIndex, int highIndex) {
		int dividend = (elementToFind - sortedArray[lowIndex]) * (highIndex - lowIndex);
		int divider = sortedArray[highIndex] - sortedArray[lowIndex];
		int calculetedPos = lowIndex + (dividend / divider);
		return calculetedPos;
	}

	private boolean isValidInterval(int elementToFind, Integer[] sortedArray, int lowIndex, int highIndex) {
		boolean greaterThanOrEqual = (elementToFind >= sortedArray[lowIndex]);
		boolean lowerThanOrEqual = (elementToFind <= sortedArray[highIndex]);
		boolean isValidInterval = greaterThanOrEqual && lowerThanOrEqual;
		return isValidInterval;

	}

}
