package com.personal.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class getmaxTest {

	@Test
	public void test() {
		int res;
		getmax gt = new getmax();
		res = gt.findMax(-1, 5);
		assertEquals(5, res);
		res = gt.findMax(7, 5);
		assertEquals(7, res);
	}

}
