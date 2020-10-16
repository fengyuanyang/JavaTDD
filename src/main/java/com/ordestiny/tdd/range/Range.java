package com.ordestiny.tdd.range;

public class Range {
	
	private int[] intArrays;

	/**
	 * get all points from start to end
	 * @param start
	 * @param end
	 * @return
	 */
	public int[] getAllPoints(int start, int end) {
		if (start <= end) {
			intArrays = new int[end - start + 1];
			int index = 0;
			for (int i = start; i <= end; i++) {
				intArrays[index] = i;
				index++;
			}
			return intArrays;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
}
