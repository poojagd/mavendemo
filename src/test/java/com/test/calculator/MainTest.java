package com.test.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

import com.code.calculator.Calculator;

public class MainTest {
	
	Calculator c=new Calculator(10, 5);

	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		assertEquals(15, c.add(),0 );
	}
	
	@Test
	public void testMultiply() {
		assertEquals( 50, c.multiply(),0 );
	}
	
	@Test
	public void testDivide() {
		assertEquals( 2, c.divide(),0 );
	}
	
	@Test
	public void testSubtract() {
		assertEquals( 5, c.subtract(),0 );
	}
	
	
}
