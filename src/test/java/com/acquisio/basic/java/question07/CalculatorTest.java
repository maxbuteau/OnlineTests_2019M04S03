package com.acquisio.basic.java.question07;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void twoPlusTwo_ReturnsFour() {
		Integer expected = 4;
		Integer actual = Calculator.applyOperation(2, 2, '+');
		assertEquals(actual, expected);
	}
	@Test
	public void oneMinusThree_ReturnsMinusTwo() {
		Integer expected = -2;
		Integer actual = Calculator.applyOperation(1, 3, '-');
		assertEquals(actual, expected);
	}
	@Test
	public void divideByZero_ReturnsNull() {
		Integer expected = null;
		Integer actual = Calculator.applyOperation(1, 0, '/');
		assertEquals(actual, expected);
	}
	@Test
	public void unknownOperator_throwsIllegalArgumentException() {
		char operator = '&';
		try {
			Calculator.applyOperation(2, 3, operator);
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().trim().contains("Operator '" +operator+ "' not supported"));
		}
	}

}

