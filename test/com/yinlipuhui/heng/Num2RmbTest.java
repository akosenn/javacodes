package com.yinlipuhui.heng;

import static org.junit.Assert.*;

import org.junit.Test;

public class Num2RmbTest {

	@Test
	public void testDivide() {
		String[] array = Num2Rmb.divide(56445.555);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	@Test
	public void testToHanziStr() {
		System.out.println(Num2Rmb.toHanziStr(5544.44));
	}
}
