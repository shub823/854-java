package com.lti.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.demo.Calculator;

public class CalculatorTest {

	@Test
	public void additionOfTwoNos() {
		Calculator c = new Calculator();
		int result = c.add(30,20);
		assertEquals(50, result);
		
	}
	@Test
	public void subtractionOfTwoNos() {
		Calculator c = new Calculator();
		int result = c.sub(20,20);
		assertEquals(0, result);
	}
	

}
