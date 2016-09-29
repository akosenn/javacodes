package com.yinlipuhui.callback;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocalTest {

	@Test
	public void test() {
        Local local = new Local(new Remote(),"Hello");    
        local.sendMessage();  
	}
}
