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

	/**
	 * checks if point from start to end contains point from compareStart to compareEnd
	 *
	 * @param start
	 * @param end
	 * @param compareStart
	 * @param compareEnd
	 * @return true for containing range
	 */
	public boolean containsRange(int start, int end, int compareStart, int compareEnd) {
		if (start < end && compareStart < compareEnd) {
			if (compareStart <= end && compareEnd <= end){
				return true;
			}
			return false;
		}
		else{
      throw new IllegalArgumentException();
    }
  }
  
  /**
	 * checks if point from start to end overlaps with point from compareStart to compareEnd
	 *
	 * @param start
	 * @param end
	 * @param compareStart
	 * @param compareEnd
	 * @return true for overlaps range
	 */
	public boolean overlapsRange(int start, int end, int compareStart, int compareEnd) {
		if (start < end && compareStart < compareEnd) {
			if (compareStart > end) {
				return false;
			}
			return true;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
