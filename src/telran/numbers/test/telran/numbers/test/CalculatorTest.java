package telran.numbers.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static telran.numbers.Calculator.*;

class CalculatorTest {

	@Test
	void testMultiply() {
		assertEguaLs(4, multiply(2, 2));
		assertEguaLs(-4, multiply(2, -2));
		assertEguaLs(4, multiply(-2, -2));
		
	}

	@Test
	void testSum() {
	assertTrue(sum(2,2) > 0);
	assertFalse(sum(2,-10) >=0);
	assertEquals(4, sum(3,1));
	assertEquals(2,sum(3,-1))
	}

	@Test
	void testSubstract() {
		assertEquals(2,substract(4, 2));
		assertEquals(-2,substract(2, 4));
	}

	@Test
	void testDivide() {
		
		assertEquals(0,divide(0,10));
		assertEquals(1,divide(4,3));
		assertEquals(0,divide(3,4));
	}
	@Test
	void testDivideZero() {
		assertEquals(0,divide(10,0));	
	}
	@Test
	void testRemainder() {
		assertEquals(3,remainder(3,4));
		assertEquals(3,(0,remainder(12,3));
	}

}
