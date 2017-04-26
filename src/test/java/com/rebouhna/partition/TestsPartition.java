package com.rebouhna.partition;


import org.junit.Assert;
import org.junit.Test;

public class TestsPartition {
	

	@Test
	public void testIfTableauNull() {
		Assert.assertNull(Partition.partition(null, 0));
	}
	
	@Test
	public void testPivotPair() {
		int[] tab = {1,2,3,4,5};
		int[][] result = {{1,2},{3,4},{5}};
		Assert.assertArrayEquals(Partition.partition(tab, 2 ),result);
	}
	
	@Test
	public void testPivotImPair() {
		int[] tab = {1,2,3,4,5};
		int[][] result = {{1,2,3},{4,5}};
		Assert.assertArrayEquals(Partition.partition(tab, 3 ),result);
	}
	
	@Test
	public void testTableauLengthPairPivotPair() {
		int[] tab = {1,2,3,4,5,6};
		int[][] result = {{1,2,3,4},{5,6}};
		Assert.assertArrayEquals(Partition.partition(tab,4),result);
	}
	
	@Test
	public void testTableauLengthImPairPivotImPair() {
		int[] tab = {1,2,3,4,5,6,7};
		int[][] result = {{1,2,3},{4,5,6},{7}};
		Assert.assertArrayEquals(Partition.partition(tab,3),result);
	}
	
	@Test
	public void testTableauLengthImPairPivotImPairtwo() {
		int[] tab = {1,2,3,4,5,6,7};
		int[][] result = {{1,2,3,4,5},{6,7}};
		Assert.assertArrayEquals(Partition.partition(tab,5),result);
	}
	

}
