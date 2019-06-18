package test;

import org.junit.Test;
import org.junit.Assert;
import edu.sbme.oop.MergeUniqueArrays;

public class MergeUniqueArraysTest {
	@Test
	public void SecondArrayLengthMoreTest() {
		int a[] =  {1,2};
		int b[] =  {0,5,6};
		int c[] =  {0,1,2,5,6};

		int d[] = MergeUniqueArrays.mergeArrays(a,b);
		for(int i =0;i < d.length;i++)
			System.out.println(d[i]);
		//result printed {0,1,2,6,0}
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(a,b));
	}
	
	@Test
	public void FirstArrayLengthMoreTest() {
		int b[] =  {1,5};
		int a[] =  {2,4,6};
		int c[] =  {1,2,4,5,6};
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(a,b));
	}
	
	@Test
	public void TwoEqualLengthdTest() {
		int a[] =  {10,20};
		int b[] =  {40,5};
		int c[] =  {5,10,20,40};
		int d[] = MergeUniqueArrays.mergeArrays(a,b);
		for(int i =0;i < d.length;i++)
			System.out.println(d[i]);
		//result printed {10,20,5,0}
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(a,b));
	}
	
	@Test
	public void TestFirstArrayNull() {
		int b[] =  {3,4};
		int c[] = b;
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(null,b));
	}
	@Test
	public void TestFirstArrayZeroLength() {
		int a[] = {};
		int b[] =  {3,4};
		int c[] = b;
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(a,b));
	}
	
	@Test
	public void TestSecondArrayNull() {
		int a[] =  {1,2};
		int c[] = a;
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(a,null));
	}
	@Test
	public void TestSecondArrayZeroLength() {
		int b[] = {};
		int a[] =  {1,2};
		int c[] = a;
		Assert.assertArrayEquals(c, MergeUniqueArrays.mergeArrays(a,b));
	}
	
	
}