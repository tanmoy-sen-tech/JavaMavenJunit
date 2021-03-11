package com.personal.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class sortarrayTest {
	sortarray sc =  new sortarray();
	@Test
	public void test() {
		int[] item= {8,2,7,45,10,23};
		int[] exp= {2,7,8,10,23,45};
		int[] result=sc.sortArray(item);
		assertArrayEquals(exp,result);
	}

}
