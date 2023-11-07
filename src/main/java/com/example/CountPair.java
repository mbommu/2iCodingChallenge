package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Count for the pairs by summing to given number.
 */
public class CountPair {
	
	/**
	 * This method returns the count of matched pairs.
	 * @param x - sum number
	 * @param numbers - Passed in whole numbers
	 * @return count - Sum of Pair counts
	 */
	public int getPair(int x, int ...numbers) {
		int count=0;
		for(int j=0; j<numbers.length; j++) {
			for(int i=j; i<numbers.length-1; i++) { 
				if(numbers[j] + numbers[i+1] == x) {
					count++;
				}
			}

		}
		return count;
	}

}
