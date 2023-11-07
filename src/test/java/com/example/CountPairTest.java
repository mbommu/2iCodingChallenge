package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class to count pairs.
 */
public class CountPairTest {
	
	private CountPair countPair = new CountPair();
	
	@Test
	public void shouldReturnCountPair() {
		int count = countPair.getPair(42, new int[] {3,4,5,6});
		Assert.assertEquals("Count Pair should be 0", 0, count);
	}

}
